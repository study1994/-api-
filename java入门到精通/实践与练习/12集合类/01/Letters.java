
import java.util.ArrayList;
import java.util.Iterator;

public class Letters { // 创建一个Letters（字母）类
	public static void main(String[] args) {
		char letter[] = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S',
				'T', 'U', 'V', 'W', 'X', 'Y', 'Z' }; // 创建一个char类型的数组，用来存放26个大写的英文字母
		// 创建两个ArrayList对象：集合list1和集合list2
		ArrayList<Character> list1 = new ArrayList<>();
		ArrayList<Character> list2 = new ArrayList<>();
		for (int i = 0; i < letter.length; i++) { // 使用for循环遍历char类型的数组
			list1.add(letter[i]); // 向集合list1添加元素（A→Z）
			list2.add((char) (187 - letter[i])); // 向集合list2添加元素（z→a）
		}
		System.out.println("使用迭代器输出“A→Z”："); // 提示信息
		Iterator<Character> it = list1.iterator(); // 创建迭代器
		while (it.hasNext()) {// 判断集合list1中是否还有元素
			Object element = it.next(); // 接收集合list1中的元素
			System.out.print(element + " "); // 输出集合list1中的元素
		}
		System.out.println(); // 换行
		System.out.println("使用for循环输出“z→a”："); // 提示信息
		for (int i = 0; i < list2.size(); i++) {// 使用for循环遍历集合list2中的元素
			System.out.print(list2.get(i) + " "); // 输出集合list2中的元素
		}
	}
}
