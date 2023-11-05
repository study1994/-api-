
import java.util.ArrayList;
import java.util.Iterator;

class Account { // ����һ��Account���˻�����
	String time; // ����һ��String���͵ı���time���桢ȡ��ʱ�䣩
	int in; // ����һ��int���͵ı���in�����룩
	int out; // ����һ��int���͵ı���out��֧����
	static int left; // ����һ����̬��int���͵ı���left���
	
	// �����вη�����ʹ��this�ؼ�������ͬ���Ĳ����ͱ���������������ֵ��������
	public Account(String time, int in, int out) {
		this.time = time;
		this.in = in;
		this.out = out;
	}

	@Override
	public String toString() { // ��дtoString()����
		left += in - out; // �滻����left
		return time + "\t" + in + "\t" + out + "\t" + left; // ��������Ľ����Ϣ����ʽ
	}
}

public class Money { // ����һ��Money��
	public static void main(String[] args) {
		System.out.println("�桢ȡ��ʱ��\t����\t֧��\t���"); // ��ʾ��Ϣ
		ArrayList<Account> list = new ArrayList<>(); // ����ArrayList����
		// ʹ��add()�����򼯺�list�����Ԫ�أ�����
		list.add(new Account("2017-05-06", 2000, 0));
		list.add(new Account("2017-05-18", 0, 1000));
		list.add(new Account("2017-06-08", 5000, 0));
		list.add(new Account("2017-06-23", 0, 1500));
		list.add(new Account("2017-07-03", 3000, 0));
		list.add(new Account("2017-07-19", 0, 1000));
		list.add(new Account("2017-08-01", 1000, 0));
		list.add(new Account("2017-08-10", 0, 1500));
		Iterator<Account> it = list.iterator(); // ����������
		while (it.hasNext()) { // �жϼ���list���Ƿ���Ԫ��
			Object message = it.next(); // ���ռ���list�е�Ԫ��
			System.out.println(message + "\t"); // �������list�е�Ԫ��
		}
	}
}
