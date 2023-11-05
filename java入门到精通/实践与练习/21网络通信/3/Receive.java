
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.net.*;
import javax.swing.*;

public class Receive extends JFrame implements Runnable, ActionListener {
	int port; // �˿�
	InetAddress group = null; // �㲥���ַ
	MulticastSocket socket = null; // ���㲥�׽��ֶ���
	JButton inceBtn = new JButton("��ʼ����");
	JButton stopBtn = new JButton("ֹͣ����");
	JTextArea inceAr = new JTextArea(10, 10); // ��ʾ���չ㲥���ı���
	JTextArea inced = new JTextArea(10, 10);
	Thread thread;
	boolean stop = false; // ֹͣ������Ϣ״̬

	public Receive() {
		setTitle("�㲥���ݱ�");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		thread = new Thread(this);
		inceBtn.addActionListener(this); // �󶨰�ťince�ĵ����¼�
		stopBtn.addActionListener(this); // �󶨰�ťstop�ĵ����¼�
		inceAr.setForeground(Color.blue); // ָ���ı��������ֵ���ɫ
		JPanel north = new JPanel(); // ����Jpanel����
		north.add(inceBtn); // ����ť��ӵ����north��
		north.add(stopBtn);
		add(north, BorderLayout.NORTH); // ��north�����ڴ�����ϲ�
		JPanel center = new JPanel(); // ����������center
		center.setLayout(new GridLayout(1, 2)); // ������岼��
		center.add(inceAr); // ���ı�����ӵ������
		center.add(inced);
		add(center, BorderLayout.CENTER); // ������岼��
		validate(); // ˢ��
		port = 9898; // ���ö˿ں�
		try {
			group = InetAddress.getByName("224.255.10.0"); // ָ�����յ�ַ
			socket = new MulticastSocket(port); // �󶨶��㲥�׽���
			socket.joinGroup(group); // ����㲥��
		} catch (IOException e) {
			e.printStackTrace(); // ����쳣��Ϣ
		}
		setBounds(100, 50, 360, 380); // ���ò���
		setVisible(true); // ����������Ϊ��ʾ״̬
	}

	public void run() { // run()����
		while (!stop) {
			byte data[] = new byte[1024]; // ���������ֽ�����
			DatagramPacket packet = null;
			packet = new DatagramPacket(data, data.length, group, port); // �����յ����ݰ�
			try {
				socket.receive(packet); // �������ݰ�
				String message = new String(packet.getData(), 0, packet.getLength()); // ��ȡ���ݰ��е�����
				inceAr.setText("���ڽ��յ����ݣ�\n" + message); // ������������ʾ���ı�����
				inced.append(message + "\n"); // ÿ����ϢΪһ��
			} catch (IOException e) {
				e.printStackTrace(); // ����쳣��Ϣ
			}
		}
	}

	public void actionPerformed(ActionEvent e) { // �����¼�
		if (e.getSource() == inceBtn) { // ������ťince�������¼�
			inceBtn.setBackground(Color.red); // ���ð�ť��ɫ
			stopBtn.setBackground(Color.yellow);
			if (!(thread.isAlive())) { // ���̲߳����ڡ��½�״̬��
				thread = new Thread(this); // ʵ����Thread����
			}
			thread.start(); // �����߳�
			stop = false; // ��ʼ������Ϣ
		}
		if (e.getSource() == stopBtn) { // ������ťstop�������¼�
			inceBtn.setBackground(Color.yellow); // ���ð�ť��ɫ
			stopBtn.setBackground(Color.red);
			stop = true; // ֹͣ������Ϣ
		}
	}

	public static void main(String[] args) {
		Receive rec = new Receive();
		rec.setSize(460, 200);
	}
}
