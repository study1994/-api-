
import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class MrSoft extends JFrame { // ����һ�������˵����࣬���̳�JFrame
	private JPanel contentPane; // �������
	private JLabel lblWords; // ���ֱ�ǩ

	public static void main(String[] args) {
		MrSoft mrSoftFrame = new MrSoft(); // ���������˵��򡱴������
		mrSoftFrame.setVisible(true); // ʹ�����˵��򡱴���������
	}

	/**
	 * ��������
	 */
	public MrSoft() { // �����˵��򡱴���Ĺ��췽��
		setResizable(false); // ���ɸı䴰���С
		setTitle("�޺��֮���˵���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ����Ĺرշ�ʽ
		setBounds(100, 100, 330, 150); // ���ô���Ĵ�С��λ��
		// �������
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		// ���ֱ�ǩ
		lblWords = new JLabel("�� �� �� �� �� �� ��");
		lblWords.setHorizontalAlignment(SwingConstants.CENTER);
		lblWords.setFont(new Font("�����п�", Font.PLAIN, 28));
		contentPane.add(lblWords, BorderLayout.CENTER);

		Thread colorThread = new BackgroundColor(contentPane); // �����߳��������֮������ɫ���Ķ���
		Thread styleThread = new WordsStyle(lblWords); // �����߳��������֮��������ʽ���Ķ���

		colorThread.start(); // ���á�����ɫ���߳�
		styleThread.start(); // ���á�������ʽ���߳�
	}
}

class BackgroundColor extends Thread { // ����������ɫ����̳��߳���
	private JPanel contentPane; // �������

	public BackgroundColor(JPanel contentPane) { // ��ͼ���ǩΪ�����Ĺ��췽�������ù��췽����ʼ������
		this.contentPane = contentPane;
	}

	@Override
	public void run() { // �߳�Ҫִ�е�����
		while (true) { // ʹ�̴߳�������״̬
			try {
				Thread.sleep(3000); // �߳�����3��
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			contentPane.setBackground(Color.YELLOW); // ���ı���ɫΪ��ɫ
			try {
				Thread.sleep(3000); // �߳�����3��
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			contentPane.setBackground(Color.CYAN); // ���ı���ɫΪ��ɫ
			try {
				Thread.sleep(3000); // �߳�����3��
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			contentPane.setBackground(Color.MAGENTA); // ���ı���ɫΪ�Ϻ�ɫ
			try {
				Thread.sleep(3000); // �߳�����3��
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			contentPane.setBackground(Color.WHITE); // ���ı���ɫΪ��ɫ
		}
	}
}

class WordsStyle extends Thread { // ������������ʽ����̳��߳���

	private JLabel lblWords; // ���ֱ�ǩ

	public WordsStyle(JLabel lblWords) { // �����ֱ�ǩΪ�����Ĺ��췽�������ù��췽����ʼ������
		this.lblWords = lblWords;
	}

	@Override
	public void run() { // �߳�Ҫִ�е�����
		while (true) { // ʹ�̴߳�������״̬
			try {
				Thread.sleep(3000); // �߳�����3��
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			// ����������ɫ��������ʽ
			lblWords.setForeground(Color.BLUE);
			lblWords.setFont(new Font("��������", Font.BOLD, 28));
			try {
				Thread.sleep(3000); // �߳�����3��
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			// ����������ɫ��������ʽ
			lblWords.setForeground(Color.RED);
			lblWords.setFont(new Font("������κ", Font.BOLD | Font.ITALIC, 28));
			try {
				Thread.sleep(3000); // �߳�����3��
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			// ����������ɫ��������ʽ
			lblWords.setForeground(Color.GREEN);
			lblWords.setFont(new Font("��������", Font.ITALIC, 28));
			try {
				Thread.sleep(3000); // �߳�����3��
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			// ����������ɫ��������ʽ
			lblWords.setForeground(Color.BLACK);
			lblWords.setFont(new Font("�����п�", Font.PLAIN, 28));
		}
	}
}