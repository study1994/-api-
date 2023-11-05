
import java.util.Scanner;

public class PermitEnum { // ����һ��PermitEnum��Ȩ�ޣ���
	enum POP {
		TOURIST, USER, VIP, MANAGER; // �ѳ���������ö������Identity����ݣ���

		public static POP getPop(int id) {// ����һ����̬�������������������ȡ��ӦPOPö��ֵ
			switch (id) {
			case 0:
				return POP.TOURIST;
			case 1:
				return POP.USER;
			case 2:
				return POP.VIP;
			case 3:
				return POP.MANAGER;
			default:
				return POP.TOURIST;
			}
		}
	}

	public static void main(String[] args) {
		System.out.print("Welcome to ����ѧԺ��\n\n�������������\n��0��ʾ�οͣ�1��ʾע���û���2��ʾVIP��Ա��3��ʾ����Ա����"); // ��ʾ��Ϣ
		Scanner sc = new Scanner(System.in); // ����̨����
		POP pop = POP.getPop((int) sc.nextInt());// ���������ȡö��ֵ
		switch (pop) { // ���֧���
		case TOURIST: // ��¼�˵�����ǡ��ο͡�ʱ��������ο͡���Ȩ��
			System.out.println("�������ǡ��ο͡��������е�Ȩ�����£�\n�ۿ�������Ƶ��������пγ̡�ע�ᡢ��¼��");
			break;
		case USER: // ��¼�˵�����ǡ�ע���û���ʱ�������ע���û�����Ȩ��
			System.out.println("���ѳ�Ϊע���û��������е�Ȩ�����£�\n��ѹۿ�������Ƶ����������ϰ�⡢�ղؿγ̡�ʵʱ���ʡ��������ã�");
			break;
		case VIP: // ��¼�˵�����ǡ�VIP��Ա��ʱ�������VIP��Ա����Ȩ��
			System.out.println("���ѳ�ΪVIP��Ա�������е�Ȩ�����£�\n��ѹۿ�������Ƶ������ϰ�⼰�𰸡�Դ�����ء��������߻���������");
			break;
		case MANAGER: // ��¼�˵�����ǡ�����Ա��ʱ�����������Ա����Ȩ��
			System.out.println("���Ǵ�BOSS��ӵ�б�վ����Ȩ�ޣ�\n��̨���й���ģ�顢ǰ̨���й���ģ�飡");
			break;
		}
		sc.close(); // �رտ���̨����
	}
}
