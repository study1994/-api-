import java.util.Scanner;
public class Ticket {// �ͳ���Ʊϵͳ
	public static void main(String[] args) {
		int zuo[][] = new int[9][4];// �����ά����
		for (int i = 0; i < 9; i++) {// forѭ����ʼ
			for (int j = 0; j < 4; j++) {// forѭ����ʼ
				zuo[i][j] = 1;// ��ʼ����ά����
			}
		}
		while (true) {// ��ʼ��Ʊ
			// �������
			System.out.println("            �򵥿ͳ���Ʊϵͳ" + "\n����9��4�еĴ�ͳ���ʼ��Ʊ");
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 4; j++) {
					System.out.print(zuo[i][j] + "\t");// �����Ʊ��Ϣ
				}
				System.out.println();// ������з�
			}
			// ����ɨ���������������û�����
			Scanner sc = new Scanner(System.in);
			// ��ʾ�û�������Ϣ
			System.out.print("������ҪԤ������λ�кţ�");
			int row = sc.nextInt();// �õ���λ����
			// ��ʾ�û�������Ϣ
			System.out.print("������ҪԤ������λ�кţ�");
			int column = sc.nextInt();// �õ���λ����
			zuo[row - 1][column - 1] = 0;// ����۳�Ʊ״̬
		}
	}
}
