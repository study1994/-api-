
public class SingleNum {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 1; i < 101; i++) {
			// Ĭ��������
			boolean flag = true;
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					// ������
					flag = false;
				}
			}
			if (flag) {
				count += 1;
				System.out.print(i + ",");
			}
		}
		System.out.println("\n����" + count + "������");
	}
}