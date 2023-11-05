
import java.io.IOException;
import java.net.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeNotification extends Thread {
	InetAddress iaddress = null;
	MulticastSocket socket = null; // ���㲥�׽���
	int port = 9898;

	TimeNotification() {
		try {
			iaddress = InetAddress.getByName("224.255.10.0"); // ʵ����InetAddress��ָ����ַ
			socket = new MulticastSocket(port); // ʵ�������㲥�׽���
			socket.setTimeToLive(1); // ָ�����ͷ�Χ�Ǳ�������
			socket.joinGroup(iaddress); // ����㲥��
		} catch (IOException e) {
			e.printStackTrace(); // ����쳣��Ϣ
		}
	}

	public void run() {
		while (true) {
			DatagramPacket packet = null; // ���ݰ�
			String message = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
			byte data[] = message.getBytes(); // �ַ�����Ϣ���ֽ�����
			packet = new DatagramPacket(data, data.length, iaddress, port); // �����ݴ��
			System.out.println(message); // ����̨��ӡ��Ϣ
			try {
				socket.send(packet); // ��������
				sleep(1000); // �߳�����
			} catch (IOException e) {
				e.printStackTrace();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		TimeNotification w = new TimeNotification();
		w.start(); // �����߳�
	}
}
