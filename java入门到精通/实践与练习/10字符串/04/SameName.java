
public class SameName {
	public static void main(String[] args) {
		String str[] = {"����", "����", "����", "����", "����", "����", "�׺�", "����", "Ľ�ݰ���", "����"};
		System.out.println("���һ������ͬ��������");
		for (int i = 0; i < str.length; i++) {
			for (int j = i + 1; j < str.length; j++) {
				int len = str[i].length();
				char endChar = str[i].charAt(len - 1);
				String strEC = endChar + "";
				if (str[j].endsWith(strEC)) {
					System.out.println(str[i] + "��" + str[j]);
				}
			}
		}
	}
}
