import java.util.Scanner;

public class ReserveStr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�����������ַ�����");
		String target = sc.next();
		char[] chr = target.toCharArray();
		System.out.println("ת�ú���ַ�����");
		for (int i = chr.length - 1; i >= 0; i--) {
			System.out.print(chr[i]);
		}
		sc.close();
	}
}
