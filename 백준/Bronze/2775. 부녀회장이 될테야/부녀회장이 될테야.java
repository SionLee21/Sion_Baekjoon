import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt(); // Test case 수

        // 최대 k와 n의 값은 14
        int[][] apt = new int[15][15];

        // 0층 초기화: 0층 i호에는 i명이 산다
        for (int i = 1; i <= 14; i++) {
            apt[0][i] = i;
        }

        // 1층부터 14층까지 초기화
        for (int k = 1; k <= 14; k++) {
            for (int n = 1; n <= 14; n++) {
                for (int j = 1; j <= n; j++) {
                    apt[k][n] += apt[k-1][j];
                }
            }
        }

        // Test case별로 입력 받아 결과 출력
        for (int t = 0; t < T; t++) {
            int k = s.nextInt();
            int n = s.nextInt();
            System.out.println(apt[k][n]);
        }
    }
}
