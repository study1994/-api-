
public class SingleNum {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 1; i < 101; i++) {
			// 默认是素数
			boolean flag = true;
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					// 能整除
					flag = false;
				}
			}
			if (flag) {
				count += 1;
				System.out.print(i + ",");
			}
		}
		System.out.println("\n共计" + count + "个素数");
	}
}