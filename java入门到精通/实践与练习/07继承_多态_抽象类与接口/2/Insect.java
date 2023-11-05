
abstract class Insect {
	int legs;

	public Insect(int legs) {
		this.legs = legs;
	}

	abstract void reproduce();
}

class Fly extends Insect implements Flyable {
	public Fly(int legs) {
		super(legs);
		System.out.println("��Ӭ��" + legs + "���ȡ�");
	}

	@Override
	public void fly() {
		System.out.println("��Ӭ�����ڿ��з��С�");
	}

	@Override
	void reproduce() {
		System.out.println("��Ӭ�ķ�ֳ��ʽ�ǲ��ѡ�");
	}
}
