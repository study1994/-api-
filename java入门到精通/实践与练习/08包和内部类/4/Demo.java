abstract class Fruits {
	public abstract String getName();

}

class Human {
	void eat(Fruits food) {
		System.out.println("����һ��" + food.getName());
	}
}

public class Demo {
	public static void main(String[] args) {
		Human tom = new Human();
		tom.eat(new Fruits() {
			public String getName() {
				return "ƻ��";
			}
		});
		tom.eat(new Fruits() {
			public String getName() {
				return "�㽶";
			}
		});
	}
}
