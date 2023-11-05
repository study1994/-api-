
class Color {

}

class Red extends Color {

}

class Yellow extends Color {

}

class Blue extends Color {

}

public class ColorDemo {
	public static void main(String[] args) {
		Color color[] = { new Red(), new Yellow(), new Blue() };
		for (int i = 0; i < 3; i++) {
			int index = (int) (Math.random() * 3);
			judge(color[index]);
		}
	}

	public static void judge(Color color) {
		if (color instanceof Red)
			System.out.print("ºì");
		if (color instanceof Yellow)
			System.out.print("»Æ");
		if (color instanceof Blue)
			System.out.print("À¶");
	}
}
