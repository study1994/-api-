
public class Student {
	int number; //ѧ��
	String name; //����
	float chinese; //���ĳɼ�
	float math; //��ѧ�ɼ�
	float english; //Ӣ��ɼ�
	
	public Student(int number, String name, float chinese, float math, float english) { //�����вη���������this�ؼ������������ĳ�Ա���������
		this.number = number;
		this.name = name;
		this.chinese = chinese;
		this.math = math;
		this.english = english;
	}

	public void average() { //����ƽ���ֵķ���
		float aver = (chinese + math + english)/3; //aver��ʾƽ����
		System.out.println(number + "\t" + name + "\t" + chinese + "\t" + math + "\t" + english + "\t" + aver);
	}

	public static void main(String[] args) {
		System.out.println("ѧ��\t����\t����\t��ѧ\tӢ��\tƽ����");
		System.out.println("����������������������������������������������������������������������������������������������������");
		Student student1 = new Student(1, "����", 91.5f, 98f, 89f); //�����ĸ��Ƴɼ�
		student1.average(); //����������ƽ����
		
		Student student2 = new Student(2, "����", 96f, 98.5f, 93f); //���ĵĸ��Ƴɼ�
		student2.average(); //�������ĵ�ƽ����
		
		Student student3 = new Student(3, "����", 97f, 100f, 98.5f); //����ĸ��Ƴɼ�
		student3.average(); //���������ƽ����
		
		Student student4 = new Student(4, "Ǯ��", 77f, 83f, 81f); //Ǯ���ĸ��Ƴɼ�
		student4.average(); //����Ǯ����ƽ����
	}
}
