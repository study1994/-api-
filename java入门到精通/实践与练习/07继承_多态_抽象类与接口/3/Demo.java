
class People {
}

class Teacher extends People {
	public void order() {
		System.out.println("����ʦ�����ˡ�������˿��");
	}
}

class Student extends People {
	public void order() {
		System.out.println("��ѧ�������ˡ����ȳ��桱");
	}
}

class Doctor extends People {
	public void order() {
		System.out.println("��ҽ�������ˡ����������");
	}
}

public class Demo {
	public static void main(String[] args) {
		People p1 = new Teacher();
		Teacher teacher = (Teacher) p1;
		teacher.order();
		People p2 = new Student();
		Student student = (Student) p2;
		student.order();
		People p3 = new Doctor();
		Doctor doctor = (Doctor) p3;
		doctor.order();
	}
}
