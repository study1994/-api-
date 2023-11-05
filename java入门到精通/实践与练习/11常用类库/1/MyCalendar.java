import java.util.Calendar;

public class MyCalendar {
	public static void main(String[] args) {
		StringBuilder str = new StringBuilder(); // ���ڼ�¼�������
		Calendar c = Calendar.getInstance(); // ��ȡ������������
		int year = c.get(Calendar.YEAR); // ��ǰ��
		int month = c.get(Calendar.MONTH) + 1; // ��ǰ��
		c.add(Calendar.MONTH, 1); // ����һ����
		c.set(Calendar.DAY_OF_MONTH, 0); // ���ڱ�Ϊ�ϸ������һ��
		int dayCount = c.get(Calendar.DAY_OF_MONTH); // ��ȡ�·�������
		c.set(Calendar.DAY_OF_MONTH, 1); // ��������Ϊ�·ݵ�һ��
		int week = c.get(Calendar.DAY_OF_WEEK); // ��ȡ��һ���������
		int day = 1; // �ӵ�һ�쿪ʼ
		str.append("\t\t" + year + "-" + month + "\n"); // ��ʾ����
		str.append("��\tһ\t��\t��\t��\t��\t��\n"); // ������
		for (int i = 1; i <= 7; i++) { // �ȴ�ӡ�հ�����
			if (i < week) { // �����ǰ����С�ڵ�һ�������
				str.append("\t"); // ����¼����
			} else {
				str.append(day + "\t"); // ��¼����
				day++;// ���ڵ���
			}
		}
		str.append("\n"); // ����
		int i = 1; // 7�컻һ�й����õ�����ʱ����
		while (day <= dayCount) { // �����ǰ����С�ڵ����������
			str.append(day + "\t");// ��¼����
			if (i % 7 == 0) {// ��������������
				str.append("\n");// ����
			}
			i++;// ��ʱ��������
			day++;// ��������
		}
		System.out.println(str);// ��ӡ����
	}
}
