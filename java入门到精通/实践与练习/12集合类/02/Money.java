
import java.util.ArrayList;
import java.util.Iterator;

class Account { // 创建一个Account（账户）类
	String time; // 声明一个String类型的变量time（存、取款时间）
	int in; // 声明一个int类型的变量in（存入）
	int out; // 声明一个int类型的变量out（支出）
	static int left; // 声明一个静态的int类型的变量left余额
	
	// 构造有参方法，使用this关键字区分同名的参数和变量，并将参数的值赋给变量
	public Account(String time, int in, int out) {
		this.time = time;
		this.in = in;
		this.out = out;
	}

	@Override
	public String toString() { // 重写toString()方法
		left += in - out; // 替换变量left
		return time + "\t" + in + "\t" + out + "\t" + left; // 返回输出的结果信息及格式
	}
}

public class Money { // 创建一个Money类
	public static void main(String[] args) {
		System.out.println("存、取款时间\t存入\t支出\t余额"); // 提示信息
		ArrayList<Account> list = new ArrayList<>(); // 创建ArrayList对象
		// 使用add()方法向集合list中添加元素（对象）
		list.add(new Account("2017-05-06", 2000, 0));
		list.add(new Account("2017-05-18", 0, 1000));
		list.add(new Account("2017-06-08", 5000, 0));
		list.add(new Account("2017-06-23", 0, 1500));
		list.add(new Account("2017-07-03", 3000, 0));
		list.add(new Account("2017-07-19", 0, 1000));
		list.add(new Account("2017-08-01", 1000, 0));
		list.add(new Account("2017-08-10", 0, 1500));
		Iterator<Account> it = list.iterator(); // 创建迭代器
		while (it.hasNext()) { // 判断集合list中是否还有元素
			Object message = it.next(); // 接收集合list中的元素
			System.out.println(message + "\t"); // 输出集合list中的元素
		}
	}
}
