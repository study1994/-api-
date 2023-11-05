class Toilet<T> {
	public void enter(T t) {

	}
}

class Male {

}

class Female {

}

public class Demo {
	public static void main(String[] args) {
		Toilet<Male> mansroom = new Toilet();
		Toilet<Female> womansroom = new Toilet();
	}
}
