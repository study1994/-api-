public class Computer {
	public static int getMaxComm(int m, int n) throws Exception {
		if (m <= 0 || n <= 0) {
			throw new Exception("���ݵĲ�������������");
		}
		if (m < n) {
			int temp = 0;
			temp = m;
			m = n;
			n = temp;
		}
		int r = m % n;
		while (r != 0) {
			m = n;
			n = r;
			r = m % n;
		}
		return n;
	}

	public static void main(String[] args) {
		try {
			int m = 122, n = 0;
			int reslut = getMaxComm(m, n);
			System.out.println(m + " �� " + n + "�����Լ���ǣ�" + reslut);
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}