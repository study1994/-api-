public class Demo {
	public static void main(String[] args) {
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println(i);
				if (i == 2) {
					throw new Exception("中断循环");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				if (i == 2) {
					throw new Exception("不中断循环");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
