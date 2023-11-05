import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.TreeSet;

public class Dice // 创建一个Dice（骰子）类
{
	public static void main(String[] args) {
		System.out.println("—————————————掷骰子游戏—————————————\n");
		List list = new ArrayList(); // 用ArrayList实现List接口
		// 使用add()方法向集合list中添加元素
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		System.out.println("骰子的点数：" + list); // 输出未遍历的集合list
		Random random = new Random(); // 创建Random对象
		// 随机生成四个在0-5之间的整数
		int index1 = random.nextInt(6);
		int index2 = random.nextInt(6);
		int index3 = random.nextInt(6);
		int index4 = random.nextInt(6);
		Map map = new HashMap(); // 用HashMap实现Map接口
		// 使用put()方法向集合map中添加元素，其中Value是以随机数作为索引来获取集合list中的元素
		map.put("张三", list.get(index1));
		map.put("李四", list.get(index2));
		map.put("王五", list.get(index3));
		map.put("赵六", list.get(index4));
		TreeSet ts = new TreeSet(); // 创建TreeSet对象
		// 使用add()方法向集合ts中添加元素
		ts.add(list.get(index1));
		ts.add(list.get(index2));
		ts.add(list.get(index3));
		ts.add(list.get(index4));
		System.out.println("=============掷骰子结果============="); // 提示信息
		if (ts.size() != 4) // 当集合ts中的元素个数不等于4时
		{
			oneByOne(map); // 调用oneByOne()方法并传参
			System.out.println("==============本轮作废=============="); // 提示信息
			System.out.println("本轮掷骰子有重复的点数，重新开始下一轮！"); // 输出结果
		} else // 当集合ts中的元素个数等于4时
		{
			oneByOne(map); // 调用oneByOne()方法并传参
			System.out.println("=============本轮胜出者============="); // 提示信息
			Iterator iter = map.keySet().iterator(); // 创建迭代器
			while (iter.hasNext()) // 判断集合map中是否还有key
			{
				Object key = iter.next(); // 接收key值
				if (ts.last().equals(map.get(key))) // 当点数的最大值等于集合map中Value值时
				{
					System.out.println(key); // 输出集合map中与Value值对应的key值
				}
			}
		}
	}

	public static void oneByOne(Map map) // 创建静态的有参方法oneByOne(map)
	{
		/**
		 * 迭代map中的元素（键、值对）
		 */
		Iterator iterator = map.keySet().iterator(); // 创建迭代器
		while (iterator.hasNext()) // 判断集合map中是否还有key
		{
			Object key = iterator.next(); // 接收key值
			System.out.println(key + "的点数：" + map.get(key)); // 输出key值以及key值对应的Value值
		}
	}
}
