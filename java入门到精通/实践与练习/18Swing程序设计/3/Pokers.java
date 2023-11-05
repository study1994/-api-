
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;

public class Pokers extends JFrame { // 创建“扑克牌”类继承JFrame
	// 声明窗体中的成员组件
	private JPanel contentPane;
	private JLabel lblFirst;
	private JLabel lblSecond;
	private JLabel lblThird;
	private JLabel lblFourth;

	/**
	 * 主方法
	 */
	public static void main(String[] args) {
		Pokers frame = new Pokers(); // 创建Pokers对象
		frame.setVisible(true); // 使frame可视
	}

	/**
	 * 创建JFrame窗体
	 */
	public Pokers() { // Pokers的构造方法
		setTitle("可翻转的扑克牌"); // 设置窗体题目
		setResizable(false); // 不可改变窗体宽高
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 设置窗体关闭的方式
		setBounds(100, 100, 509, 200); // 设置窗体的位置和宽高
		/**
		 * 创建JPanel面板contentPane置于JFrame窗体中，并设置面板的背景色、边距和布局
		 */
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 153, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		/**
		 * 创建标签lblFirst置于面板contentPane中，设置标签的图标、位置、宽高
		 */
		lblFirst = new JLabel("");
		lblFirst.addMouseListener(new MouseAdapter() { // 图标label鼠标事件的监听
			@Override
			public void mouseEntered(MouseEvent e) { // 鼠标移入时的监听
				lblFirst.setIcon(new ImageIcon(Pokers.class.getResource("3.png"))); // 重新设置标签label里的图标
			}

			@Override
			public void mouseExited(MouseEvent e) { // 鼠标移出时的监听
				lblFirst.setIcon(new ImageIcon(Pokers.class.getResource("5.png"))); // 重新设置标签label里的图标
			}
		});
		lblFirst.setIcon(new ImageIcon(Pokers.class.getResource("5.png")));
		lblFirst.setBounds(10, 10, 113, 153);
		contentPane.add(lblFirst);
		/**
		 * 创建标签lblSecond置于面板contentPane中，设置标签的图标、位置、宽高
		 */
		lblSecond = new JLabel("");
		lblSecond.addMouseListener(new MouseAdapter() { // 图标label_1鼠标事件的监听
			@Override
			public void mouseEntered(MouseEvent e) { // 鼠标移入时的监听
				lblSecond.setIcon(new ImageIcon(Pokers.class.getResource("2.png"))); // 重新设置标签label_1里的图标
			}

			@Override
			public void mouseExited(MouseEvent e) { // 鼠标移出时的监听
				lblSecond.setIcon(new ImageIcon(Pokers.class.getResource("5.png"))); // 重新设置标签label_1里的图标
			}
		});
		lblSecond.setIcon(new ImageIcon(Pokers.class.getResource("5.png")));
		lblSecond.setBounds(133, 10, 113, 153);
		contentPane.add(lblSecond);
		/**
		 * 创建标签lblThird置于面板contentPane中，设置标签的图标、位置、宽高
		 */
		lblThird = new JLabel("");
		lblThird.addMouseListener(new MouseAdapter() { // 图标label_2鼠标事件的监听
			@Override
			public void mouseEntered(MouseEvent e) { // 鼠标移入时的监听
				lblThird.setIcon(new ImageIcon(Pokers.class.getResource("4.png"))); // 重新设置标签label_2里的图标
			}

			@Override
			public void mouseExited(MouseEvent e) { // 鼠标移出时的监听
				lblThird.setIcon(new ImageIcon(Pokers.class.getResource("5.png"))); // 重新设置标签label_2里的图标
			}
		});
		lblThird.setIcon(new ImageIcon(Pokers.class.getResource("5.png")));
		lblThird.setBounds(256, 10, 113, 153);
		contentPane.add(lblThird);
		/**
		 * 创建标签lblFourth置于面板contentPane中，设置标签的图标、位置、宽高
		 */
		lblFourth = new JLabel("");
		lblFourth.addMouseListener(new MouseAdapter() { // 图标label_3鼠标事件的监听
			@Override
			public void mouseEntered(MouseEvent e) { // 鼠标移入时的监听
				lblFourth.setIcon(new ImageIcon(Pokers.class.getResource("1.png"))); // 重新设置标签label_3里的图标
			}

			@Override
			public void mouseExited(MouseEvent e) { // 鼠标移出时的监听
				lblFourth.setIcon(new ImageIcon(Pokers.class.getResource("5.png"))); // 重新设置标签label_3里的图标
			}
		});
		lblFourth.setIcon(new ImageIcon(Pokers.class.getResource("5.png")));
		lblFourth.setBounds(379, 10, 113, 153);
		contentPane.add(lblFourth);
	}
}
