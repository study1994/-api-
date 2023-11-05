import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.TreeSet;

public class Dice // ����һ��Dice�����ӣ���
{
	public static void main(String[] args) {
		System.out.println("����������������������������������Ϸ��������������������������\n");
		List list = new ArrayList(); // ��ArrayListʵ��List�ӿ�
		// ʹ��add()�����򼯺�list�����Ԫ��
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		System.out.println("���ӵĵ�����" + list); // ���δ�����ļ���list
		Random random = new Random(); // ����Random����
		// ��������ĸ���0-5֮�������
		int index1 = random.nextInt(6);
		int index2 = random.nextInt(6);
		int index3 = random.nextInt(6);
		int index4 = random.nextInt(6);
		Map map = new HashMap(); // ��HashMapʵ��Map�ӿ�
		// ʹ��put()�����򼯺�map�����Ԫ�أ�����Value�����������Ϊ��������ȡ����list�е�Ԫ��
		map.put("����", list.get(index1));
		map.put("����", list.get(index2));
		map.put("����", list.get(index3));
		map.put("����", list.get(index4));
		TreeSet ts = new TreeSet(); // ����TreeSet����
		// ʹ��add()�����򼯺�ts�����Ԫ��
		ts.add(list.get(index1));
		ts.add(list.get(index2));
		ts.add(list.get(index3));
		ts.add(list.get(index4));
		System.out.println("=============�����ӽ��============="); // ��ʾ��Ϣ
		if (ts.size() != 4) // ������ts�е�Ԫ�ظ���������4ʱ
		{
			oneByOne(map); // ����oneByOne()����������
			System.out.println("==============��������=============="); // ��ʾ��Ϣ
			System.out.println("�������������ظ��ĵ��������¿�ʼ��һ�֣�"); // ������
		} else // ������ts�е�Ԫ�ظ�������4ʱ
		{
			oneByOne(map); // ����oneByOne()����������
			System.out.println("=============����ʤ����============="); // ��ʾ��Ϣ
			Iterator iter = map.keySet().iterator(); // ����������
			while (iter.hasNext()) // �жϼ���map���Ƿ���key
			{
				Object key = iter.next(); // ����keyֵ
				if (ts.last().equals(map.get(key))) // �����������ֵ���ڼ���map��Valueֵʱ
				{
					System.out.println(key); // �������map����Valueֵ��Ӧ��keyֵ
				}
			}
		}
	}

	public static void oneByOne(Map map) // ������̬���вη���oneByOne(map)
	{
		/**
		 * ����map�е�Ԫ�أ�����ֵ�ԣ�
		 */
		Iterator iterator = map.keySet().iterator(); // ����������
		while (iterator.hasNext()) // �жϼ���map���Ƿ���key
		{
			Object key = iterator.next(); // ����keyֵ
			System.out.println(key + "�ĵ�����" + map.get(key)); // ���keyֵ�Լ�keyֵ��Ӧ��Valueֵ
		}
	}
}
