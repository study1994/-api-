public class Length {
	static double ratio = 2.54; // ������Ӣ��֮���ת��ϵ��

	public static double transferCM(double cm) { // ������ת��ΪӢ�硱�ķ���
		double inch = cm / ratio;
		return inch;
	}

	public static double transferINCH(double inch) { // ��Ӣ��ת��Ϊ���ס��ķ���
		double cm = inch * ratio;
		return cm;
	}

	public static void main(String[] args) {
		System.out.println("10����ת��Ӣ��Ľ��Ϊ��" + transferCM(10));
		System.out.println("10Ӣ����ת�����׵Ľ��Ϊ��" + transferINCH(10));
	}
}
