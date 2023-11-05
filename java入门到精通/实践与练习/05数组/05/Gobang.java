import java.util.Arrays;
import java.util.Scanner;

/**
 * ����������
 *
 */
public class Gobang {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean finish = false; // ��Ϸ�Ƿ����
        int turn = 1; // ��ǰ�����߱��,1��PLAYER1���壬-1��PLAYER2����
        int x = 0, y = 0; // ��ǰ���ӵĺ�������
        final char PLAYER1 = '*';// ���1ʹ�õ��ַ�
        final char PLAYER2 = 'o';// ���2ʹ�õ��ַ�
        final char EMPTY = '-';// ������ʹ�õ��ַ�

        /* ���̳�ʼ�� */
        char checkerboard[][] = new char[10][10];
        for (int i = 0; i < checkerboard.length; i++) {
            Arrays.fill(checkerboard[i], EMPTY);
        }

        game : while (!finish) {
            /* ��ӡ���� */
            System.out.println("---------------------");
            System.out.println("  0 1 2 3 4 5 6 7 8 9");
            for (int i = 0; i < checkerboard.length; i++) {
                System.out.print(i + " ");
                for (int j = 0; j < checkerboard[i].length; j++) {
                    System.out.print(checkerboard[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("---------------------");

            /* �жϵ�ǰ������ */
            if (turn == 1) {
                System.out.println("��" + PLAYER1 + "�����������꣺");
            } else {
                System.out.println("��" + PLAYER2 + "�����������꣺");
            }

            /* ������������ */
            String str = sc.nextLine();

            x = Integer.parseInt(String.valueOf(str.charAt(0)));
            y = Integer.parseInt(String.valueOf(str.charAt(1)));

            /* �ж������Ƿ�������֮�� */
            if (x < 0 || x > 8 || y < 0 || y > 8) {
                System.out.println("***������������������������룡***");
                continue;
            }

            /* �ж��������Ƿ������� */
            if (checkerboard[x][y] == EMPTY) {
                if (turn == 1) {
                    checkerboard[x][y] = PLAYER1;
                } else {
                    checkerboard[x][y] = PLAYER2;
                }
            } else {
                System.out.println("***������λ���Ѿ����������ӣ�������ѡ��***");
                continue;
            }

            /* ��������Ӯ�㷨��*/
            for (int i = 0; i < checkerboard.length; i++) {
                for (int j = 0; j < checkerboard[i].length; j++) {
                    char flagch = checkerboard[i][j];
                    if (flagch == EMPTY) {// ����˴�û������
                        continue;// ��������Ӯ�ж�
                    }
                    /* �ж�������� */
                    if (y - 4 >= 0) {
                        if (checkerboard[i][j - 1] == flagch
                                && checkerboard[i][j - 2] == flagch
                                && checkerboard[i][j - 3] == flagch
                                && checkerboard[i][j - 4] == flagch) {
                            finish = true;
                            break game;
                        }
                    }

                    /* �ж������Ҳ� */
                    if (y + 4 <= 9) {
                        if (checkerboard[i][j + 1] == flagch
                                && checkerboard[i][j + 2] == flagch
                                && checkerboard[i][j + 3] == flagch
                                && checkerboard[i][j + 4] == flagch) {
                            finish = true;
                            break game;
                        }
                    }
                    /* �ж������Ϸ� */
                    if (x - 4 >= 0) {
                        if (checkerboard[i - 1][j] == flagch
                                && checkerboard[i - 2][j] == flagch
                                && checkerboard[i - 3][j] == flagch
                                && checkerboard[i - 4][j] == flagch) {
                            finish = true;
                            break game;
                        }
                    }
                    /* �ж������·� */
                    if (x + 4 <= 9) {
                        if (checkerboard[i + 1][j] == flagch
                                && checkerboard[i + 2][j] == flagch
                                && checkerboard[i + 3][j] == flagch
                                && checkerboard[i + 4][j] == flagch) {
                            finish = true;
                            break game;
                        }
                    }
                    /* �ж��������� */
                    if (x - 4 >= 0 && y - 4 >= 0) {
                        if (checkerboard[i - 1][j - 1] == flagch
                                && checkerboard[i - 2][j - 2] == flagch
                                && checkerboard[i - 3][j - 3] == flagch
                                && checkerboard[i - 4][j - 4] == flagch) {
                            finish = true;
                            break game;
                        }
                    }
                    /* �ж��������� */
                    if (x + 4 <= 9 && y - 4 >= 0) {
                        if (checkerboard[i + 1][j - 1] == flagch
                                && checkerboard[i + 2][j - 2] == flagch
                                && checkerboard[i + 3][j - 3] == flagch
                                && checkerboard[i + 4][j - 4] == flagch) {
                            finish = true;
                            break game;
                        }
                    }
                    /* �ж����Ӷ��� */
                    if (x - 4 >= 0 && y + 4 <= 9) {
                        if (checkerboard[i - 1][j + 1] == flagch
                                && checkerboard[i - 2][j + 2] == flagch
                                && checkerboard[i - 3][j + 3] == flagch
                                && checkerboard[i - 4][j + 4] == flagch) {
                            finish = true;
                            break game;
                        }
                    }
                    /* �ж����Ӷ��� */
                    if (x + 4 <= 9 && y + 4 <= 9) {
                        if (checkerboard[i + 1][j + 1] == flagch
                                && checkerboard[i + 2][j + 2] == flagch
                                && checkerboard[i + 3][j + 3] == flagch
                                && checkerboard[i + 4][j + 4] == flagch) {
                            finish = true;
                            break game;
                        }
                    }
                }
            }
            turn *= -1; // ���������߱��
        }

        /* ������ʤ�������� */
        System.out.println("---------------------");
        System.out.println("  0 1 2 3 4 5 6 7 8 9");
        for (int i = 0; i < checkerboard.length; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < checkerboard[i].length; j++) {
                System.out.print(checkerboard[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("---------------------");
        /* ���Ӯ�� */
        if (turn == 1) {
            System.out.println("*��ʤ����");
        } else {
            System.out.println("o��ʤ����");
        }
        sc.close();
    }
}
