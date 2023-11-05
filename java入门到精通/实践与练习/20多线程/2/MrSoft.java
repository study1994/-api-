
import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class MrSoft extends JFrame { // 创建一个“流浪地球”类，并继承JFrame
	private JPanel contentPane; // 内容面板
	private JLabel lblWords; // 文字标签

	public static void main(String[] args) {
		MrSoft mrSoftFrame = new MrSoft(); // 创建“流浪地球”窗体对象
		mrSoftFrame.setVisible(true); // 使“流浪地球”窗体对象可视
	}

	/**
	 * 创建窗体
	 */
	public MrSoft() { // “流浪地球”窗体的构造方法
		setResizable(false); // 不可改变窗体大小
		setTitle("霓虹灯之流浪地球");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 窗体的关闭方式
		setBounds(100, 100, 330, 150); // 设置窗体的大小、位置
		// 内容面板
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		// 文字标签
		lblWords = new JLabel("流 · 浪 · 地 · 球");
		lblWords.setHorizontalAlignment(SwingConstants.CENTER);
		lblWords.setFont(new Font("华文行楷", Font.PLAIN, 28));
		contentPane.add(lblWords, BorderLayout.CENTER);

		Thread colorThread = new BackgroundColor(contentPane); // 创建线程类的子类之“背景色”的对象
		Thread styleThread = new WordsStyle(lblWords); // 创建线程类的子类之“字体样式”的对象

		colorThread.start(); // 启用“背景色”线程
		styleThread.start(); // 启用“字体样式”线程
	}
}

class BackgroundColor extends Thread { // 创建“背景色”类继承线程类
	private JPanel contentPane; // 内容面板

	public BackgroundColor(JPanel contentPane) { // 以图像标签为参数的构造方法，利用构造方法初始化变量
		this.contentPane = contentPane;
	}

	@Override
	public void run() { // 线程要执行的任务
		while (true) { // 使线程处于启用状态
			try {
				Thread.sleep(3000); // 线程休眠3秒
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			contentPane.setBackground(Color.YELLOW); // 面板的背景色为黄色
			try {
				Thread.sleep(3000); // 线程休眠3秒
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			contentPane.setBackground(Color.CYAN); // 面板的背景色为黑色
			try {
				Thread.sleep(3000); // 线程休眠3秒
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			contentPane.setBackground(Color.MAGENTA); // 面板的背景色为紫红色
			try {
				Thread.sleep(3000); // 线程休眠3秒
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			contentPane.setBackground(Color.WHITE); // 面板的背景色为白色
		}
	}
}

class WordsStyle extends Thread { // 创建“字体样式”类继承线程类

	private JLabel lblWords; // 文字标签

	public WordsStyle(JLabel lblWords) { // 以文字标签为参数的构造方法，利用构造方法初始化变量
		this.lblWords = lblWords;
	}

	@Override
	public void run() { // 线程要执行的任务
		while (true) { // 使线程处于启用状态
			try {
				Thread.sleep(3000); // 线程休眠3秒
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			// 设置字体颜色，字体样式
			lblWords.setForeground(Color.BLUE);
			lblWords.setFont(new Font("方正舒体", Font.BOLD, 28));
			try {
				Thread.sleep(3000); // 线程休眠3秒
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			// 设置字体颜色，字体样式
			lblWords.setForeground(Color.RED);
			lblWords.setFont(new Font("华文新魏", Font.BOLD | Font.ITALIC, 28));
			try {
				Thread.sleep(3000); // 线程休眠3秒
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			// 设置字体颜色，字体样式
			lblWords.setForeground(Color.GREEN);
			lblWords.setFont(new Font("华文隶书", Font.ITALIC, 28));
			try {
				Thread.sleep(3000); // 线程休眠3秒
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			// 设置字体颜色，字体样式
			lblWords.setForeground(Color.BLACK);
			lblWords.setFont(new Font("华文行楷", Font.PLAIN, 28));
		}
	}
}