
interface Light {
	public void light();
}

public class Match {
	public static void main(String[] args) {
		new Match() {
			public void light() {
				System.out.println("һ����񱻵�ȼ�ˡ���");
			}
		}.light();
	}
}
