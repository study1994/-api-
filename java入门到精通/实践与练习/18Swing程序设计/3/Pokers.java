
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;

public class Pokers extends JFrame { // �������˿��ơ���̳�JFrame
	// ���������еĳ�Ա���
	private JPanel contentPane;
	private JLabel lblFirst;
	private JLabel lblSecond;
	private JLabel lblThird;
	private JLabel lblFourth;

	/**
	 * ������
	 */
	public static void main(String[] args) {
		Pokers frame = new Pokers(); // ����Pokers����
		frame.setVisible(true); // ʹframe����
	}

	/**
	 * ����JFrame����
	 */
	public Pokers() { // Pokers�Ĺ��췽��
		setTitle("�ɷ�ת���˿���"); // ���ô�����Ŀ
		setResizable(false); // ���ɸı䴰����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ���ô���رյķ�ʽ
		setBounds(100, 100, 509, 200); // ���ô����λ�úͿ��
		/**
		 * ����JPanel���contentPane����JFrame�����У����������ı���ɫ���߾�Ͳ���
		 */
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 153, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		/**
		 * ������ǩlblFirst�������contentPane�У����ñ�ǩ��ͼ�ꡢλ�á����
		 */
		lblFirst = new JLabel("");
		lblFirst.addMouseListener(new MouseAdapter() { // ͼ��label����¼��ļ���
			@Override
			public void mouseEntered(MouseEvent e) { // �������ʱ�ļ���
				lblFirst.setIcon(new ImageIcon(Pokers.class.getResource("3.png"))); // �������ñ�ǩlabel���ͼ��
			}

			@Override
			public void mouseExited(MouseEvent e) { // ����Ƴ�ʱ�ļ���
				lblFirst.setIcon(new ImageIcon(Pokers.class.getResource("5.png"))); // �������ñ�ǩlabel���ͼ��
			}
		});
		lblFirst.setIcon(new ImageIcon(Pokers.class.getResource("5.png")));
		lblFirst.setBounds(10, 10, 113, 153);
		contentPane.add(lblFirst);
		/**
		 * ������ǩlblSecond�������contentPane�У����ñ�ǩ��ͼ�ꡢλ�á����
		 */
		lblSecond = new JLabel("");
		lblSecond.addMouseListener(new MouseAdapter() { // ͼ��label_1����¼��ļ���
			@Override
			public void mouseEntered(MouseEvent e) { // �������ʱ�ļ���
				lblSecond.setIcon(new ImageIcon(Pokers.class.getResource("2.png"))); // �������ñ�ǩlabel_1���ͼ��
			}

			@Override
			public void mouseExited(MouseEvent e) { // ����Ƴ�ʱ�ļ���
				lblSecond.setIcon(new ImageIcon(Pokers.class.getResource("5.png"))); // �������ñ�ǩlabel_1���ͼ��
			}
		});
		lblSecond.setIcon(new ImageIcon(Pokers.class.getResource("5.png")));
		lblSecond.setBounds(133, 10, 113, 153);
		contentPane.add(lblSecond);
		/**
		 * ������ǩlblThird�������contentPane�У����ñ�ǩ��ͼ�ꡢλ�á����
		 */
		lblThird = new JLabel("");
		lblThird.addMouseListener(new MouseAdapter() { // ͼ��label_2����¼��ļ���
			@Override
			public void mouseEntered(MouseEvent e) { // �������ʱ�ļ���
				lblThird.setIcon(new ImageIcon(Pokers.class.getResource("4.png"))); // �������ñ�ǩlabel_2���ͼ��
			}

			@Override
			public void mouseExited(MouseEvent e) { // ����Ƴ�ʱ�ļ���
				lblThird.setIcon(new ImageIcon(Pokers.class.getResource("5.png"))); // �������ñ�ǩlabel_2���ͼ��
			}
		});
		lblThird.setIcon(new ImageIcon(Pokers.class.getResource("5.png")));
		lblThird.setBounds(256, 10, 113, 153);
		contentPane.add(lblThird);
		/**
		 * ������ǩlblFourth�������contentPane�У����ñ�ǩ��ͼ�ꡢλ�á����
		 */
		lblFourth = new JLabel("");
		lblFourth.addMouseListener(new MouseAdapter() { // ͼ��label_3����¼��ļ���
			@Override
			public void mouseEntered(MouseEvent e) { // �������ʱ�ļ���
				lblFourth.setIcon(new ImageIcon(Pokers.class.getResource("1.png"))); // �������ñ�ǩlabel_3���ͼ��
			}

			@Override
			public void mouseExited(MouseEvent e) { // ����Ƴ�ʱ�ļ���
				lblFourth.setIcon(new ImageIcon(Pokers.class.getResource("5.png"))); // �������ñ�ǩlabel_3���ͼ��
			}
		});
		lblFourth.setIcon(new ImageIcon(Pokers.class.getResource("5.png")));
		lblFourth.setBounds(379, 10, 113, 153);
		contentPane.add(lblFourth);
	}
}
