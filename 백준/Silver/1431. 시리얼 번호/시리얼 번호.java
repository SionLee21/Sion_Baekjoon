import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine(); // 개행 문자 소비
        List<String> serialNumbers = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            serialNumbers.add(scanner.nextLine());
        }
        scanner.close();

        Collections.sort(serialNumbers, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                // 1. 길이가 다르면, 짧은 것이 먼저 온다.
                if (s1.length() != s2.length()) {
                    return s1.length() - s2.length();
                }
                // 2. 길이가 같으면, 숫자의 합을 비교한다.
                int sum1 = getDigitSum(s1);
                int sum2 = getDigitSum(s2);
                if (sum1 != sum2) {
                    return sum1 - sum2;
                }
                // 3. 길이와 숫자의 합이 같으면, 사전순으로 비교한다.
                return s1.compareTo(s2);
            }

            private int getDigitSum(String s) {
                int sum = 0;
                for (char c : s.toCharArray()) {
                    if (Character.isDigit(c)) {
                        sum += c - '0';
                    }
                }
                return sum;
            }
        });

        for (String serial : serialNumbers) {
            System.out.println(serial);
        }
    }
}
