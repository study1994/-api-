
public class YangHui {// ��������㷨��ʵ��
	public static void main(String[] args) {
		// ����һ������Ϊ10�Ķ�ά����
		int[][] Array_int = new int[10][];
		// �������м�¼��������ε�ֵ
		for (int i = 0; i < Array_int.length; i++) {// ��������
			Array_int[i] = new int[i + 1];// �����ά���������
			// ������ά���������
			for (int j = 0; j < Array_int[i].length; j++) {
				if (i <= 1) {// ����������ǰ����
					Array_int[i][j] = 1;// ��������Ϊ1
					continue;
				} else {
					// ��������׻���β
					if (j == 0 | j == Array_int[i].length - 1)
						Array_int[i][j] = 1;// ��������Ϊ1
					else// ��������㷨���м���
						Array_int[i][j] = Array_int[i - 1][j - 1] + Array_int[i - 1][j];
				}
			}
		}
		for (int i = 0; i < Array_int.length; i++) {// ����������
			for (int j = 0; j < Array_int[i].length; j++)
				System.out.print(Array_int[i][j] + "\t");
			System.out.println();
		}
	}
}
