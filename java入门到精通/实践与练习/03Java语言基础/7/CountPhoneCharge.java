
public class CountPhoneCharge {
	public static void main(String[] args) {
		double phonecharge = 10; // ��ǰ����
		double communtime; // ͨ��ʱ��
		double flux = 10; // ʹ��10M����
		double fluxCost = flux * 0.3; // 10M�����ķ���
		double communcost = 0.2; // ͨ��0.2Ԫ/����
		communtime = (phonecharge - fluxCost) / communcost; // ����ʣ��ͨ��ʱ��
		System.out.println("��������ͨ��ʱ��Ϊ" + communtime + "����");
	}
}
