import java.util.Scanner;

public class Bookshelf {
	public static void main(String[] args) {
		String books[][] = {// ��ʼ��һ��String���͵Ķ�ά����
				{"��Java��", "��Java Web��", "��C���ԡ�", "��C++��", "��Linux C��"},	
				{"�����", "������ͨ����", "����ʮ���¾���", "��ʷ�ǡ�", "������ʷ��"}
				};
		Scanner sc = new Scanner(System.in);// ����̨����
		// ����̨�����ʾ��Ϣ
		System.out.println("��������Ҫ������������ؼ��֣�");
		String message = sc.next();// ���տ���̨�����������ؼ���
		// ����̨�����ʾ��Ϣ
		System.out.println("--------------�������--------------");
		for (int i = 0; i < books.length; i++)// ��������
		{
			for (int j = 0; j < books[i].length; j++) 
			{
				// �ж������Ƿ����message
				if(books[i][j].contains(message) || 
				   // �ж�ȥ����Сд�������Ƿ����message
				   books[i][j].toLowerCase().contains(message))
				{
					// ��������ʱ��������������λ��
					System.out.println(books[i][j] + "��" + 
					"��" + (i + 1) + "�������ĵ�" + (j + 1) + "����");
				}
			}
			System.out.println();// ����
		}
		sc.close();// �رտ���̨����
	}
}
