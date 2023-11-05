public class Car { // 创建汽车类
	private String brand; // 汽车品牌
	Engine engine = new Engine("EA211");

	public Car(String brand) { // 汽车类的构造方法，参数为汽车品牌
		this.brand = brand; // 给汽车品牌赋值
	}

	class Engine { // 发动机类（内部类）
		String model; // 发动机型号

		public Engine(String model) { // 发动机类的构造方法，参数为发动机型号
			this.model = model; // 给发动机型号赋值
		}

		public void ignite() { // （发动机）点火方法
			System.out.println("发动机" + this.model + "点火");
		}
	}

	public void start() { // 启动（汽车）方法
		System.out.println("启动" + this.brand);
		engine.ignite();
	}

	public static void main(String[] args) {
		Car car = new Car("大众朗行"); // 创建汽车类对象，并为汽车品牌赋值
		car.start(); // 汽车类对象调用启动（汽车）方法
	}
}
