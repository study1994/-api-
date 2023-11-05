
import java.io.IOException;
import java.net.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeNotification extends Thread {
	InetAddress iaddress = null;
	MulticastSocket socket = null; // 多点广播套接字
	int port = 9898;

	TimeNotification() {
		try {
			iaddress = InetAddress.getByName("224.255.10.0"); // 实例化InetAddress，指定地址
			socket = new MulticastSocket(port); // 实例化多点广播套接字
			socket.setTimeToLive(1); // 指定发送范围是本地网络
			socket.joinGroup(iaddress); // 加入广播组
		} catch (IOException e) {
			e.printStackTrace(); // 输出异常信息
		}
	}

	public void run() {
		while (true) {
			DatagramPacket packet = null; // 数据包
			String message = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
			byte data[] = message.getBytes(); // 字符串消息的字节数组
			packet = new DatagramPacket(data, data.length, iaddress, port); // 将数据打包
			System.out.println(message); // 控制台打印消息
			try {
				socket.send(packet); // 发送数据
				sleep(1000); // 线程休眠
			} catch (IOException e) {
				e.printStackTrace();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		TimeNotification w = new TimeNotification();
		w.start(); // 启动线程
	}
}
