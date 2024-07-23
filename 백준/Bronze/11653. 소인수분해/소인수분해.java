import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        br.close();

        if (N == 1) {
            return; // N이 1인 경우 아무것도 출력하지 않음
        }

        // 2부터 N의 제곱근까지 소인수분해 시도
        for (int i = 2; i <= Math.sqrt(N); i++) {
            while (N % i == 0) {
                System.out.println(i);
                N /= i;
            }
        }

        // N이 1보다 큰 경우, 나머지 소수 출력
        if (N > 1) {
            System.out.println(N);
        }
    }
}
