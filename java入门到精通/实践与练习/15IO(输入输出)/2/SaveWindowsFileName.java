import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SaveWindowsFileName {

	public static void main(String[] args) {
		File file = new File("D:\\word.txt"); // �����ļ�����
		File dir = new File("C:\\Windows");
		File fs[] = dir.listFiles();
		try {
			FileWriter fw = new FileWriter(file); // �ļ��ַ������
			BufferedWriter bw = new BufferedWriter(fw); // ���������
			for (File f : fs) {
				bw.write(f.getAbsolutePath()); // д���ַ���
				bw.newLine(); // д��һ�����з�
			}
			bw.close(); // �رջ��������
			fw.close(); // �ر��ļ��ַ������
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
