public class Car { // ����������
	private String brand; // ����Ʒ��
	Engine engine = new Engine("EA211");

	public Car(String brand) { // ������Ĺ��췽��������Ϊ����Ʒ��
		this.brand = brand; // ������Ʒ�Ƹ�ֵ
	}

	class Engine { // �������ࣨ�ڲ��ࣩ
		String model; // �������ͺ�

		public Engine(String model) { // ��������Ĺ��췽��������Ϊ�������ͺ�
			this.model = model; // ���������ͺŸ�ֵ
		}

		public void ignite() { // ������������𷽷�
			System.out.println("������" + this.model + "���");
		}
	}

	public void start() { // ����������������
		System.out.println("����" + this.brand);
		engine.ignite();
	}

	public static void main(String[] args) {
		Car car = new Car("��������"); // ������������󣬲�Ϊ����Ʒ�Ƹ�ֵ
		car.start(); // ����������������������������
	}
}
