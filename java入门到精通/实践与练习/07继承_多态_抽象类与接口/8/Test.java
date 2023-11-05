
public class Test {
	public static void main(String[] args) {
		Number number = new Number();
		for (int i = 1; i <= 7; i++) {
			number.add();
		}
		for (int i = 1; i <= 4; i++) {
			number.reduce();
		}
		number.output();
	}
}
