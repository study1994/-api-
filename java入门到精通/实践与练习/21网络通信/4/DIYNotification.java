
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DIYNotification extends JFrame implements Runnable {
	InetAddress iaddress = null;
	MulticastSocket socket = null; // ���㲥�׽���
	int port = 9898;
	JLabel label, mesLabel;
	JTextField text;
	JButton btn;

	public DIYNotification() {
		try {
			iaddress = InetAddress.getByName("224.255.10.0"); // ʵ����InetAddress��ָ����ַ
			socket = new MulticastSocket(port); // ʵ�������㲥�׽���
			socket.setTimeToLive(1); // ָ�����ͷ�Χ�Ǳ�������
			socket.joinGroup(iaddress); // ����㲥��
		} catch (IOException e) {
			e.printStackTrace(); // ����쳣��Ϣ
		}

		label = new JLabel("��������Ϊ��");
		mesLabel = new JLabel("�����ź�");
		text = new JTextField(15);
		btn = new JButton("�޸�");

		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String message = text.getText().trim();
				mesLabel.setText(message);
				text.setText("");
			}
		});
		
		
		JPanel panel=new JPanel();
		panel.add(label);
		panel.add(mesLabel);
		panel.add(text);
		panel.add(btn);
		setTitle("�Զ���㲥");
		add(panel);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(200, 200, 300, 150);
	}

	public void run() {
		while (true) {
			DatagramPacket packet = null; // ���ݰ�
			String message = mesLabel.getText().trim();
			byte data[] = message.getBytes(); // �ַ�����Ϣ���ֽ�����
			packet = new DatagramPacket(data, data.length, iaddress, port); // �����ݴ��
			try {
				socket.send(packet); // ��������
				Thread.sleep(1000); // �߳�����
			} catch (IOException e) {
				e.printStackTrace();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		DIYNotification w = new DIYNotification();
		w.setVisible(true);
		Thread t = new Thread(w);
		t.start(); // �����߳�
	}
}
