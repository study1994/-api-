 class People {                     // 人类
    final Heart heart = new Heart();     // 心脏属性
    public People() {                     // 构造人类对象
        heart.beating();                  // 心脏开始跳动
    }
    class Heart {                         // 人类内部的心脏类
        public void beating() {          // 跳动
            System.out.println("心脏：扑通扑通……");
        }
    }
}

public class Demo {
	public static void main(String[] args) {
		new People();
	}
}
