
public class BuyChicken {// ��Ǯ��ټ�
	public static void main(String[] args) {
		int cock, hen, chick;// ������ĸ����С��
		for (cock = 0; cock <= 20; cock++) {// �����20ֻ����
			for (hen = 0; hen <= 33; hen++) {// �����33ֻĸ��
				for (chick = 3; chick <= 99; chick += 3) {// �����99ֻС�����С��ټ��������ƣ�
					if (5 * cock + 3 * hen + chick / 3 == 100) {// ��Ǯ
						if (cock + hen + chick == 100) {// �ټ�
							System.out.println("������" + cock + "\tĸ����" + hen + "\tС����" + chick);
						}
					}
				}
			}
		}
	}
}
