
public class SwapRC {// ������ά�������������
	public static void main(String[] args) {
		int i, j;// ���������������ֱ�������Ϊ�к��е�ѭ������
		// ��ʼ��һ����̬��int�Ͷ�ά����
		int[][] array = { { 8, 75, 23 }, { 21, 55, 34 }, { 15, 23, 20 } };
		System.out.println("����������ԭʼ���顪��������");// ��ʾ��Ϣ
		// ����ԭʼ�Ķ�ά����
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				System.out.print(array[i][j] + "\t");// ���ԭʼ�����е�Ԫ��
			}
			System.out.println();// ����
		}
		int temp;// ��ʱ����
		// ͨ��ѭ������Ԫ�ص�λ��
		for (i = 0; i < 3; i++) {
			for (j = 0; j < i; j++) {
				temp = array[i][j];// ������Ԫ�ظ�����ʱ����
				// ������������
				array[i][j] = array[j][i];
				array[j][i] = temp;
			}
		}
		System.out.println("��������λ��֮������顪��");// ��ʾ��Ϣ
		// ��������λ��֮��Ķ�ά����
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				System.out.print(array[i][j] + "\t");// �������λ�ú������Ԫ��
			}
			System.out.println();// ����
		}
	}
}
