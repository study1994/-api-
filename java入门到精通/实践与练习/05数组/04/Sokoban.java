import java.util.Scanner;

public class Sokoban {

    public static void main(String[] args) {
        char map[][] = new char[8][10];// ��ͼ
        Scanner sc = new Scanner(System.in);// ����̨����ɨ����
        int x = 1, y = 1;// ��ҽ�ɫ����
        boolean finish = false;// ��Ϸ�Ƿ����

        for (int i = 0; i < map.length; i++) {// ��ͼ���ǽ��
            if (i == 0 || i == 7) {
                for (int j = 0; j < map[i].length; j++) {
                    map[i][j] = 'H';
                }
            } else {
                map[i][0] = 'H';
                map[i][9] = 'H';
            }
        }
        map[1][3] = 'H';// ��ͼ��ǽ��
        map[2][3] = 'H';
        map[3][3] = 'H';
        map[2][5] = 'H';
        map[3][5] = 'H';
        map[3][6] = 'H';
        map[3][8] = 'H';
        map[4][8] = 'H';
        map[6][4] = 'H';
        map[5][4] = 'H';
        map[5][5] = 'H';
        map[5][6] = 'H';
        map[x][y] = '&';// ��ҽ�ɫ
        map[2][2] = 'o';// ����
        map[6][5] = '*';// Ŀ�ĵ�

        while (true) {// ѭ����Ϸ
            /* ��ӡ��Ϸ���� */
            System.out.println("--------------------");
            for (char row[] : map) {
                for (char column : row) {
                    System.out.print(column + " ");
                }
                System.out.println();
            }
            System.out.println("--------------------");

            if (finish) {// �����Ϸ������ֹͣѭ��
                break;
            }

            System.out.println("A���ƣ�D���ƣ�W���ƣ�S���ƣ����������ָ�");
            String code = sc.nextLine();// ��ȡ��������ָ��

            switch (code.toLowerCase()) {// ��ִ��תΪСд���ж�
                case "a" :// ����������a
                    if (map[x][y - 1] == 0) {// ����������ǿ���
                        map[x][y] = 0;// ԭλ�ñ�Ϊ����
                        map[x][y - 1] = '&';// ����ƶ�����λ��
                        y--;// �����������
                    } else if (map[x][y - 1] == 'o') {// ���������������
                        if (map[x][y - 2] != 'H') {// ���������߲���ǽ
                            if (map[x][y - 2] == '*') {// ������������Ŀ�ĵ�
                                finish = true;// ��Ϸ����
                            }
                            map[x][y] = 0;// ԭλ�ñ�Ϊ����
                            map[x][y - 1] = '&';// ����ƶ�����λ��
                            map[x][y - 2] = 'o';// �����ƶ�����λ��
                            y--;// ���λ������
                        }
                    }
                    break;// �����ж�
                case "d" :// ����������d
                    if (map[x][y + 1] == 0) {// �������ұ��ǿ���
                        map[x][y] = 0;// ԭλ�ñ�Ϊ����
                        map[x][y + 1] = '&';// ����ƶ�����λ��
                        y++;// �����������
                    } else if (map[x][y + 1] == 'o') {// �������ұ�������
                        if (map[x][y + 2] != 'H') {// ��������ұ߲���ǽ
                            if (map[x][y + 2] == '*') {// ��������ұ���Ŀ�ĵ�
                                finish = true;// ��Ϸ����
                            }
                            map[x][y] = 0;// ԭλ�ñ�Ϊ����
                            map[x][y + 1] = '&';// ����ƶ�����λ��
                            map[x][y + 2] = 'o';// �����ƶ�����λ��
                            y++;// �����������
                        }
                    }
                    break;// �����ж�
                case "w" :// ����������w
                    if (map[x - 1][y] == 0) {// �������Ϸ��ǿ���
                        map[x][y] = 0;// ԭλ�ñ�Ϊ����
                        map[x - 1][y] = '&';// ����ƶ�����λ��
                        x--;// �����������
                    } else if (map[x - 1][y] == 'o') {// �������Ϸ�������
                        if (map[x - 2][y] != 'H') {// ��������Ϸ�����ǽ
                            if (map[x - 2][y] == '*') {// ��������Ϸ���Ŀ�ĵ�
                                finish = true;// ��Ϸ����
                            }
                            map[x][y] = 0;// ԭλ�ñ�Ϊ����
                            map[x - 1][y] = '&';// ����ƶ�����λ��
                            map[x - 2][y] = 'o';// �����ƶ�����λ��
                            x--;// �����������
                        }
                    }
                    break;// �����ж�
                case "s" :// ����������s
                    if (map[x + 1][y] == 0) {// �������·��ǿ���
                        map[x][y] = 0;// ԭλ�ñ�Ϊ����
                        map[x + 1][y] = '&';// ����ƶ�����λ��
                        x++;// �����������
                    } else if (map[x + 1][y] == 'o') {// �������·�������
                        if (map[x + 2][y] != 'H') {// ��������·�����ǽ
                            if (map[x + 2][y] == '*') {// ��������·���Ŀ�ĵ�
                                finish = true;// ��Ϸ����
                            }
                            map[x][y] = 0;// ԭλ�ñ�Ϊ����
                            map[x + 1][y] = '&';// ����ƶ�����λ��
                            map[x + 2][y] = 'o';// �����ƶ�����λ��
                            x++;// �����������
                        }
                    }
                    break;// �����ж�
                default :// ��������������ָ��
                    System.out.println("�������ָ������");
            }

        }
        System.out.println("��Ϸ����");
        sc.close();
    }

}
