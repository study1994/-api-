
public class NumberConvert {
	public static void main(String[] args) {
		int number = 123; // ��������Ҫ��ת��������
		// �����������ֽ���numberת����Ľ��
		int number1;
		int number2;
		int number3;
		number1 = number % 10; // �����λ���ϵ�����
		number2 = number / 10 % 10; // ����ʮλ���ϵ�����
		number3 = number / 100; // �����λ���ϵ�����
		System.out.println(number + "ת����Ľ��Ϊ" + number1 + number2 + number3); // ���ת����Ľ��
	}
}
