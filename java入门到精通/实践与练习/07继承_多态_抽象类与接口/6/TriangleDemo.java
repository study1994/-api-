
abstract class Shape {
	abstract void calPerimeter();
}

class Triangle extends Shape {
	double a, b, c;
	boolean flag;

	public Triangle(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public void judge() {
		if (a >= b + c || b >= a + c || c >= a + b) {
			flag = false;
		} else {
			flag = true;
		}
	}

	@Override
	void calPerimeter() {
		if (flag == true) {
			System.out.println("��Ϊ" + a + "��" + b + "��" + c + "��3�����ܹ��������Σ���������ε��ܳ�Ϊ" + (a + b + c));
		} else {
			System.out.println("��Ϊ" + a + "��" + b + "��" + c + "��3���߲��ܹ��������Σ���Ϊ����������֮�ͱ�����ڵ�����");
		}
	}
}

public class TriangleDemo {
	public static void main(String[] args) {
		Triangle t1 = new Triangle(3, 4, 5);
		t1.judge();
		t1.calPerimeter();
		Triangle t2 = new Triangle(1, 4, 5);
		t2.judge();
		t2.calPerimeter();
	}
}
