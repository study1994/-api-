
interface USBRechargeable {
	void charge();
}

interface TypeCRechargeable {
	void charge();
}

class Car implements USBRechargeable, TypeCRechargeable {
	@Override
	public void charge() {
		System.out.println("�����ϵ�USB��TypeC�ӿڶ������ڸ��ֻ���硣");
	}
}
