import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int totalAsciiSum = 0;

        // 모든 대문자 알파벳의 아스키 코드 값 합을 미리 계산
        for (char c = 'A'; c <= 'Z'; c++) {
            totalAsciiSum += (int) c;
        }

        StringBuilder result = new StringBuilder();

        // 각 테스트 케이스 처리
        for (int t = 0; t < T; t++) {
            String S = br.readLine();
            Set<Character> seen = new HashSet<>();
            int currentSum = totalAsciiSum;

            // 문자열 S에 등장하는 알파벳의 아스키 코드 값을 합에서 뺀다
            for (char c : S.toCharArray()) {
                if (!seen.contains(c)) {
                    currentSum -= (int) c;
                    seen.add(c);
                }
            }

            result.append(currentSum).append("\n");
        }

        System.out.print(result.toString());
    }
}
