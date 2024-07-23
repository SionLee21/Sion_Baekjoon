import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    // 주어진 문자열이 회문인지 검사하는 함수
    private static boolean isPalindrome(String str) {
        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    }

    // 주어진 수를 뒤집는 함수
    private static int reverseNumber(int num) {
        String str = Integer.toString(num);
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return Integer.parseInt(sb.toString());
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            int N = Integer.parseInt(br.readLine());
            int reversedN = reverseNumber(N);
            int sum = N + reversedN;
            String sumStr = Integer.toString(sum);

            if (isPalindrome(sumStr)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
