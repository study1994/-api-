import java.util.Scanner;

public class SchoolReport {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�����뱾��ѧ��������");
		int studentcout = sc.nextInt();
		int achivement[][] = new int[studentcout][4];
		for (int i = 0; i < studentcout; i++) {
			System.out.println("�������" + (i + 1) + "��ѧ���ı�ţ�");
			achivement[i][0] = sc.nextInt();
			System.out.println("���������ĳɼ���");
			achivement[i][1] = sc.nextInt();
			System.out.println("��������ѧ�ɼ���");
			achivement[i][2] = sc.nextInt();
			System.out.println("������Ӣ��ɼ���");
			achivement[i][3] = sc.nextInt();
		}
		System.out.println("ѧ���ɼ��������");
		System.out.println("---------------------------------------------");
		System.out.println("ѧ�����\t���ĳɼ�\t��ѧ�ɼ�\tӢ��ɼ�\tƽ���ɼ�\t�ܳɼ�");

		for (int i = 0; i < achivement.length; i++) {
			double sum = 0;	//�ܳɼ�
			double ave = 0;	//ƽ���ɼ�
			for (int j = 0; j < achivement[i].length; j++) {
				System.out.print(achivement[i][j] + "\t");
				if (j > 0) {
					sum += achivement[i][j];
				}
			}
			ave = sum / 3;
			System.out.print(String.format("%.2f", ave) + "\t" + (int) sum
					+ "\n");
		}
	}
}
