
public class Temperature {
	public static void main(String[] args) {
		int centigrade = -40; // ���϶ȵĳ�ʼֵΪ-40
		double fahrenheit; // ���϶�
		do {
			centigrade += 10; // ÿ�м��10��
			fahrenheit = centigrade * 9 / 5.0 + 32; // �����϶�תΪ���϶ȵĹ�ʽ
			System.out.println("�����¶ȣ�" + centigrade + "��\t�����¶ȣ�" + fahrenheit + "�H");
		} while (centigrade < 50);
	}
}