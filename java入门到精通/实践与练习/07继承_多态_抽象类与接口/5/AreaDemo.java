
abstract class Shape {
	String color;
	
	public Shape(String color) {
		this.color = color;
	}
	
	abstract void getArea();
}

class Rectangle extends Shape {
	public Rectangle(String color) {
		super(color);
	}
	
	double length, width;

	@Override
	void getArea() {
		System.out.println("��Ϊ" + length + "����Ϊ" + width + "��" + 
				super.color + "ɫ�����ε������" + (length * width));
	}
}

public class AreaDemo {
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle("��");
		rectangle.length = 6;
		rectangle.width = 2;
		rectangle.getArea();
	}
}
