enum Sex {
	male, female
}

public class Demo<A, B, C> {
	A a;
	B b;
	C c;

	public Demo(A a, B b, C c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	public String toString() {
		return "Demo [a=" + a + ", b=" + b + ", c=" + c + "]";
	}

	public static void main(String[] args) {
		Demo<Integer, Integer, Integer> date = new Demo<>(2008, 8, 8);
		System.out.println(date);
		Demo<String, Integer, Sex> tom = new Demo<String, Integer, Sex>("люд╥", 175, Sex.male);
		System.out.println(tom);
	}

}
