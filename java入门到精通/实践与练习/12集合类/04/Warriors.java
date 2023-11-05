import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Warriors // 创建一个Warriors（好汉）类
{
	public static void main(String[] args) {
		HashMap hm = new HashMap(); // 创建HashMap对象
		// 使用put()方法向集合hm中添加元素
		hm.put("呼保义", "宋江");
		hm.put("玉麒麟", "卢俊义");
		hm.put("智多星", "吴用");
		hm.put("入云龙", "公孙胜");
		hm.put("大刀", "关胜");
		hm.put("豹子头", "林冲");
		hm.put("霹雳火", "秦明");
		hm.put("双鞭", "呼延灼");
		hm.put("小李广", "花荣");
		hm.put("小旋风", "柴进");
		System.out.println("梁山前十位好汉（无序）：");
		Iterator it = hm.keySet().iterator(); // 创建迭代器
		String key; // 声明一个String类型的变量key
		while (it.hasNext()) {// 判断集合hm中是否还有key
			key = (String) it.next(); // 接收key
			System.out.print(key + hm.get(key) + "　"); // 输出key和Value
		}
		System.out.println(); // 换行
		System.out.print("\n请输入上述梁山前十位好汉其中一位的绰号：");
		Scanner sc = new Scanner(System.in); // 控制台输入
		key = sc.next().trim(); // 输入key值
		System.out.println(key + "————" + hm.get(key)); // 输出与key值对应的Value值
		sc.close(); // 关闭控制台输入
	}
}
