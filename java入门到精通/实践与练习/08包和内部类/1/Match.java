
interface Light {
	public void light();
}

public class Match {
	public static void main(String[] args) {
		new Match() {
			public void light() {
				System.out.println("一根火柴被点燃了……");
			}
		}.light();
	}
}
