
public class Truck {
	public static void main(String[] args) {
		double l = 400, w = 160, h = 30;// ����ĳ����
		double r = 23;// ���ϵ�ֱ��
		int lCount = (int) (l / r);// �����Է��µ���������
		int wCount = (int) (w / r);// ����Է��µ���������
		int hCount = (int) (h / r);// �߿��Է��µ���������
		System.out.println("��������ʱ��װ" + (lCount * wCount * hCount) + "������");
		System.out.println((lCount * wCount * hCount) > 100 ? "����ʵ����װ100������" : "����ʵ����װ" + (lCount * wCount * hCount) + "������");
	}
}
