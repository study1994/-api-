interface Moveable{
	void run();
}

public class Demo {

	public static void main(String[] args) {
		Moveable dog = new Moveable() {
			public void run() {
				System.out.println("–°π∑œÚ«∞≈‹");
			}
		};
		dog.run();
	}
}
