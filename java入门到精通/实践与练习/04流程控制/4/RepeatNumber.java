
public class RepeatNumber {
	public static void main(String[] args) {
		int bai = 0; // ��λ�ϵ�����
		int shi = 0; // ʮλ�ϵ�����
		int ge = 0; // ��λ�ϵ�����
		int number = 0; // ���ֵĸ���
		for (bai = 4; bai <= 7; bai++) {
			for (shi = 4; shi <= 7; shi++) {
				for (ge = 4; ge <= 7; ge++) {
					if (bai != shi && shi != ge && bai != ge) {
						number += 1;
						System.out.println(bai * 100 + shi * 10 + ge);
					}
				}
			}
		}
		System.out.println("�ܹ��ܹ����" + number + "�����֣�");
	}
}