
public class Audience {
	String name; //����
	int age; //����
	
	public Audience(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void buyTicket() { //��Ʊ����
		if(this.age >= 18) { //��������18����
			System.out.println(name + "\t\t" + age + "\t\t" + 40);
		} else {//����δ��18����
			System.out.println(name + "\t\t" + age + "\t\t" + 40/2);
		}
	}
	
	public static void main(String[] args) {
		System.out.println("����\t\t����\t\tƱ��(Ԫ)");
		System.out.println("������������������������������������������������������������������������������");
		
		Audience audience1 = new Audience("����", 20); //������20��
		audience1.buyTicket(); //������Ʊ
		
		Audience audience2 = new Audience("Ǯ��", 16); //Ǯ���� 16��
		audience2.buyTicket(); //Ǯ����Ʊ
		
		Audience audience3 = new Audience("�ܸ�", 8); //�ܸգ� 8��
		audience3.buyTicket(); //�ܸչ�Ʊ
		
		Audience audience4 = new Audience("���", 32); //��죬32��
		audience4.buyTicket(); //��칺Ʊ
	}
}
