import java.util.Scanner;
public class Answers {// ����Scores��
	public static void main(String[] args) {
		// ��ʼ��String���͵�һά���飨��Ϊ��Ŀ�ı�׼�𰸣�
		char right[] = { 'B', 'A', 'D', 'C', 'C', 'B', 'C', 'A', 'D', 'B' };
		// ��ʼ��String���͵Ķ�ά���飨��¼8��ѧ���Ĵ𰸣�
		char choice[][] = {
				{ 'B', 'A', 'D', 'C', 'A', 'B', 'C', 'C', 'D', 'B' },
				{ 'B', 'A', 'D', 'B', 'A', 'B', 'C', 'A', 'C', 'B' },
				{ 'A', 'A', 'D', 'C', 'B', 'A', 'C', 'A', 'D', 'B' },
				{ 'B', 'C', 'D', 'C', 'A', 'B', 'C', 'B', 'D', 'A' },
				{ 'B', 'C', 'D', 'A', 'C', 'B', 'D', 'A', 'D', 'A' },
				{ 'B', 'A', 'D', 'A', 'C', 'B', 'D', 'A', 'C', 'B' },
				{ 'A', 'B', 'A', 'C', 'D', 'B', 'C', 'A', 'D', 'B' },
				{ 'B', 'A', 'D', 'C', 'D', 'B', 'A', 'C', 'D', 'B' }};
		while (true) {// ʵ�ֶ�ο���̨������Ϣ
			System.out.println("�����ȡ�ڼ�λѧ���Ĵ�����"
							 + "(��Ч����Ϊ1��8)��");// ��ʾ��Ϣ
			Scanner sc = new Scanner(System.in);// ����̨����
			int num = sc.nextInt();// ���տ���̨�������Ϣ
			int sum = 0;// ����int���͵�ȫ�ֱ���sum����Ե���Ŀ������
			System.out.println("��" + num + "λͬѧ��ȫ����Ϊ��");// ��ʾ��Ϣ
			for (int j = 0; j < choice[num - 1].length; j++) {
				System.out.print(choice[num - 1][j] + " ");// ��������Ԫ��
				// �жϼ������Ϣ�Ƿ�Ϊ��ȷ��
				if (choice[num - 1][j] == right[j]) {
					sum++;// ��Ե���Ŀ����
				}
			}
			System.out.println();// ����
			// ����̨�����Ե���Ŀ����
			System.out.println("��" + num + "λͬѧһ�������" + sum 
							 + "����" + "\n");
		}
	}
}
