
public class Calculator {
	public static double add(double a, double b) {
		return a + b;
	}
	
	public static double minus(double a, double b) {
		return a - b;
	}
	
	public static double multiply(double a, double b) {
		return a * b;
	}
	
	public static double divide(double a, double b) {
		return a / b;
	}
	
	public static void main(String[] args) {
		System.out.println("4.4����7.11�Ľ����" + Calculator.add(4.4, 7.11));
		System.out.println("8.9��ȥ2.28�Ľ����" + Calculator.minus(8.9, 2.28));
		System.out.println("5.2����13.14�Ľ����" + Calculator.multiply(5.2, 13.14));
		System.out.println("92����89�Ľ����" + Calculator.divide(92, 89));
	}
}
