public class Demo {
	public static void main(String[] args) {
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println(i);
				if (i == 2) {
					throw new Exception("�ж�ѭ��");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				if (i == 2) {
					throw new Exception("���ж�ѭ��");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
