import java.util.Scanner;

public class VerifyRegistration {
	public static void main(String[] args) {
		String[] userNames = {"mrsoft", "mr", "miss", "Admin."};
		System.out.println("��ӭ��������ѧԺע��ҳ��");
		boolean flag = true;
		String names = null;
		String userName;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("�������û�����");
			userName = sc.nextLine();
			for (int i = 0; i < userNames.length; i++) {
				names += userNames[i];
				if (userName.equals(userNames[i])) {
					System.out.println("���û����Ѵ��ڣ����������롭��");
				}
				if (!names.contains(userName)) {
					flag = false;
				}
			}
		} while (flag);
		Scanner in = new Scanner(System.in);
		System.out.println("���������룺");
		String password = in.nextLine();
		System.out.println("��ǰ�û����û�����" + userName.trim() + "\n��ǰ�û������룺" + password);
		in.close();
	}
}
