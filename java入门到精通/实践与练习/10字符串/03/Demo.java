public class Demo {

	public boolean check(String fileName) {
		boolean upperFlag = fileName.lastIndexOf(".MP4") != -1;
		boolean lowerFlag = fileName.lastIndexOf(".mp4") != -1;
		return upperFlag || lowerFlag;
	}

	public static void main(String[] args) {
		Demo d = new Demo();
		String fileName="String��ĳ��÷���.mp4";
		System.out.print(fileName+"�ļ�");
		if(d.check(fileName)) {
			System.out.println("��MP4�ļ�");
		}else {
			System.out.println("����MP4�ļ�");
		}
		
	}
}