 class People {                     // ����
    final Heart heart = new Heart();     // ��������
    public People() {                     // �����������
        heart.beating();                  // ���࿪ʼ����
    }
    class Heart {                         // �����ڲ���������
        public void beating() {          // ����
            System.out.println("���ࣺ��ͨ��ͨ����");
        }
    }
}

public class Demo {
	public static void main(String[] args) {
		new People();
	}
}
