
public class Division { // ����һ��Division��
	static int num1 = 25; // ��ʼ������������
	static int num2 = 0; // ��ʼ����������
	static int result; // �����������

	public static void division() throws ArithmeticException {
		result = num1 / num2; // Ϊ���������ֵ
	}

	public static void main(String[] args) {
		try { // try��
			division();
		} catch (ArithmeticException ae) { // catch��
			System.out.println("Сѧ����Ц���ˣ�����������0������");
		}
	}
}
