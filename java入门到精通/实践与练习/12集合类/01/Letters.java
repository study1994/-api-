
import java.util.ArrayList;
import java.util.Iterator;

public class Letters { // ����һ��Letters����ĸ����
	public static void main(String[] args) {
		char letter[] = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S',
				'T', 'U', 'V', 'W', 'X', 'Y', 'Z' }; // ����һ��char���͵����飬�������26����д��Ӣ����ĸ
		// ��������ArrayList���󣺼���list1�ͼ���list2
		ArrayList<Character> list1 = new ArrayList<>();
		ArrayList<Character> list2 = new ArrayList<>();
		for (int i = 0; i < letter.length; i++) { // ʹ��forѭ������char���͵�����
			list1.add(letter[i]); // �򼯺�list1���Ԫ�أ�A��Z��
			list2.add((char) (187 - letter[i])); // �򼯺�list2���Ԫ�أ�z��a��
		}
		System.out.println("ʹ�õ����������A��Z����"); // ��ʾ��Ϣ
		Iterator<Character> it = list1.iterator(); // ����������
		while (it.hasNext()) {// �жϼ���list1���Ƿ���Ԫ��
			Object element = it.next(); // ���ռ���list1�е�Ԫ��
			System.out.print(element + " "); // �������list1�е�Ԫ��
		}
		System.out.println(); // ����
		System.out.println("ʹ��forѭ�������z��a����"); // ��ʾ��Ϣ
		for (int i = 0; i < list2.size(); i++) {// ʹ��forѭ����������list2�е�Ԫ��
			System.out.print(list2.get(i) + " "); // �������list2�е�Ԫ��
		}
	}
}
