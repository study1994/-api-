public class Year {
	public static void main(String[] args) {
		int year = 2021;//���
		switch (year % 12) {
		case 0:
			System.out.println(year + "�����Ф�Ǻ�");
			break;
		case 1:
			System.out.println(year + "�����Ф�Ǽ�");
			break;
		case 2:
			System.out.println(year + "�����Ф�ǹ�");
			break;
		case 3:
			System.out.println(year + "�����Ф����");
			break;
		case 4:
			System.out.println(year + "�����Ф����");
			break;
		case 5:
			System.out.println(year + "�����Ф��ţ");
			break;
		case 6:
			System.out.println(year + "�����Ф�ǻ�");
			break;
		case 7:
			System.out.println(year + "�����Ф����");
			break;
		case 8:
			System.out.println(year + "�����Ф����");
			break;
		case 9:
			System.out.println(year + "�����Ф����");
			break;
		case 10:
			System.out.println(year + "�����Ф����");
			break;
		case 11:
			System.out.println(year + "�����Ф����");
			break;
		}
	}
}
