import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Warriors // ����һ��Warriors���ú�����
{
	public static void main(String[] args) {
		HashMap hm = new HashMap(); // ����HashMap����
		// ʹ��put()�����򼯺�hm�����Ԫ��
		hm.put("������", "�ν�");
		hm.put("������", "¬����");
		hm.put("�Ƕ���", "����");
		hm.put("������", "����ʤ");
		hm.put("��", "��ʤ");
		hm.put("����ͷ", "�ֳ�");
		hm.put("������", "����");
		hm.put("˫��", "������");
		hm.put("С���", "����");
		hm.put("С����", "���");
		System.out.println("��ɽǰʮλ�ú������򣩣�");
		Iterator it = hm.keySet().iterator(); // ����������
		String key; // ����һ��String���͵ı���key
		while (it.hasNext()) {// �жϼ���hm���Ƿ���key
			key = (String) it.next(); // ����key
			System.out.print(key + hm.get(key) + "��"); // ���key��Value
		}
		System.out.println(); // ����
		System.out.print("\n������������ɽǰʮλ�ú�����һλ�Ĵºţ�");
		Scanner sc = new Scanner(System.in); // ����̨����
		key = sc.next().trim(); // ����keyֵ
		System.out.println(key + "��������" + hm.get(key)); // �����keyֵ��Ӧ��Valueֵ
		sc.close(); // �رտ���̨����
	}
}
