import java.util.Scanner;
public class SearchBook {// ����һ��SearchBook��
	public static void main(String[] args) {
		String books[] = {
				"����ʷ���塷", "�������������ʷ��", "���Ͻ��ǵĻƻ衷", "���й��Ļƽ�ʱ����", 
				"����ʷʮ������", "��ͣ�͵ĵ۹���", "���Ƴ�����ָ�ϡ�", "����ʷ������", "����ʷʮ����", 
				"����������־��", "���������е��й���", "���ʵ�����š�"
		};
		Scanner sc = new Scanner(System.in);// ����̨����
		// ����̨�����ʾ��Ϣ
		System.out.println("��������Ҫ������������ؼ��֣�");
		String message = sc.next();// ���տ���̨�����������ؼ���
		// ����̨�����ʾ��Ϣ
		System.out.println("--------------�������--------------");
		for (int i = 0; i < books.length; i++)// ��������
		{
			// �ж������Ƿ����message
			if(books[i].contains(message)) {
				// ��������ʱ����������
				System.out.println(books[i]);
			}
		}
		sc.close();// �رտ���̨����
	}
}
