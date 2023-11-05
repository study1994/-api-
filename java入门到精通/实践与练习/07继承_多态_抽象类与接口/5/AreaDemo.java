
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
		System.out.println("长为" + length + "、宽为" + width + "的" + 
				super.color + "色长方形的面积是" + (length * width));
	}
}

public class AreaDemo {
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle("黄");
		rectangle.length = 6;
		rectangle.width = 2;
		rectangle.getArea();
	}
}
