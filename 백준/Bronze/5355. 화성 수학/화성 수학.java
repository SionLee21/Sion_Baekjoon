import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // 테스트 케이스의 개수
        scanner.nextLine(); // 줄바꿈 문자 소비

        for (int t = 0; t < T; t++) {
            String input = scanner.nextLine();
            String[] tokens = input.split(" ");

            // 첫 번째 토큰은 초기 숫자
            double result = Double.parseDouble(tokens[0]);

            // 나머지 토큰들은 연산자
            for (int i = 1; i < tokens.length; i++) {
                char operator = tokens[i].charAt(0);
                switch (operator) {
                    case '@':
                        result *= 3;
                        break;
                    case '%':
                        result += 5;
                        break;
                    case '#':
                        result -= 7;
                        break;
                }
            }

            // 결과 출력
            System.out.printf("%.2f%n", result);
        }

        scanner.close();
    }
}
