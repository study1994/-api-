
public class Array {// ����һ��Array��
	public static void main(String args[]) {
		int a[] = { 1, 2, 3, 4 };// ����һ��int���͵�����
		for (int i = 0; i < 5; i++) {// ��������
			try {// try��
				System.out.print("�� i = " + i + "��" + i + " < 5 ʱ��a[" + i + "] = " + a[i] + "��");// ����̨���
			} catch (ArrayIndexOutOfBoundsException e) {// catch��
				System.out.println("�� i = " + i + "��" + i + " < 5 ʱ��a[" + i + "]�����ڣ�������"
						+ e.toString().substring(10, e.toString().indexOf(':'))
						+ "�쳣��\n���쳣Ϊ����Խ���쳣����Ҫ��������������������ĳ��ȷ�Χ�����");// ����̨���
			}
			if (i != 4) {// ��i������4��ʱ��
				System.out.println("ִ��i++��" + "i = " + (i + 1) + "��");// ����̨���
			}
		}
	}
}
