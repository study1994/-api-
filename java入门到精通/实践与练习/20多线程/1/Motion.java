import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Motion extends JFrame { // �������˶�����̳д���
	private JPanel contentPane; // �������

	public static void main(String[] args) {
		Motion motion = new Motion(); // �������˶����������
		motion.setVisible(true); // ʹ���˶����������
	}

	public Motion() { // ���˶�������Ĺ��췽��
		setTitle("�����˶�");// ���ô������
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ���ùرմ���ķ�ʽ
		setBounds(100, 100, 376, 350); // ���ô���ĺᡢ�����꣬���
		// �������
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		// �䵱�˶���������
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.BLACK, 1, true));
		panel.setBounds(10, 10, 350, 270);
		contentPane.add(panel);
		panel.setLayout(null);
		// ��ʾ��Բ�㡱�ı�ǩ
		JLabel lblCircle = new JLabel("��");
		lblCircle.setBounds(27, 53, 15, 15);
		panel.add(lblCircle);
		// ��ʾ������ǡ��ı�ǩ
		JLabel lblStar = new JLabel("��");
		lblStar.setBounds(330, 189, 15, 15);
		panel.add(lblStar);
		// �����Ա�ǩ�����Ϊ�������̶߳���
		MyThread circle = new MyThread(lblCircle, panel);
		MyThread star = new MyThread(lblStar, panel);
		// ����ʼ����ť
		JButton btnStart = new JButton("��ʼ");
		btnStart.setBounds(267, 290, 93, 23);
		contentPane.add(btnStart);
		btnStart.addActionListener(new ActionListener() { // Ϊ����ʼ����ť��Ӷ����¼��ļ���
			@Override
			public void actionPerformed(ActionEvent arg0) { // ��������ʼ����ťʱ��������
				if (btnStart.getText().equals("��ʼ")) { // �������ʼ����ťʱ
					circle.start(); // ���á�Բ�㡱�߳�
					star.start(); // ���á�����ǡ��߳�
					btnStart.setText("��ͣ"); // ��ť�е����������滻Ϊ����ͣ��
				} else if (btnStart.getText().equals("��ͣ")) { // �������ͣ����ťʱ
					circle.stopRun(); // ֹͣ��Բ�㡱�߳�
					star.stopRun(); // ֹͣ������ǡ��߳�
					btnStart.setText("����"); // ��ť�е����������滻Ϊ��������
				} else if (btnStart.getText().equals("����")) { // �������������ťʱ
					circle.goRun(); // ���á�Բ�㡱�߳�
					star.goRun(); // ���á�����ǡ��߳�
					btnStart.setText("��ͣ"); // ��ť�е����������滻Ϊ����ͣ��
				}
			}
		});
	}
}

class MyThread extends Thread { // �������ҵ��̡߳��̳�Thread��
	boolean run = false; // �����̵߳ı�־
	JLabel label; // ��ǩ
	JPanel panel; // ���

	public MyThread(JLabel l, JPanel p) { // �Ա�ǩ�����Ϊ�����Ĺ��췽�������ù��췽����ʼ������
		label = l;
		panel = p;
	}

	synchronized void goRun() { // ��������
		run = false; // ��ֹ����������ѭ��
		notify(); // ���ѵȴ���wait()�����߳�
	}

	synchronized void stopRun() { // ��ͣ����
		run = true; // ��������������ѭ��
	}

	@Override
	public void run() {
		int px = panel.getWidth() - label.getWidth(); // �������߽�
		int py = panel.getHeight() - label.getHeight(); // �������߽�
		int xadd = 1, yadd = 1; // ����ƫ����
		while (true) {
			synchronized (this) {// ������
				while (run) {
					System.out.println(run);
					try {
						wait(); // ����
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			int x = label.getX(); // ��ȡ������
			int y = label.getY(); // ��ȡ������
			if (x <= 0 || x >= px) {// �ж��Ƿ񵽴�߽�
				xadd *= -1;// ������
			}
			if (y <= 0 || y >= py) {
				yadd *= -1;
			}
			label.setBounds(x + xadd, y + yadd, label.getWidth(), label.getHeight());// ��������λ��
			try {
				Thread.sleep(8); // �����̵߳����߿���ͼ��������ٶ�
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
