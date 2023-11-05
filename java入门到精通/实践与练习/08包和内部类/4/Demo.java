abstract class Fruits {
	public abstract String getName();

}

class Human {
	void eat(Fruits food) {
		System.out.println("吃了一个" + food.getName());
	}
}

public class Demo {
	public static void main(String[] args) {
		Human tom = new Human();
		tom.eat(new Fruits() {
			public String getName() {
				return "苹果";
			}
		});
		tom.eat(new Fruits() {
			public String getName() {
				return "香蕉";
			}
		});
	}
}
