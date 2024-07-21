import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        int firstMethod = s.nextInt(); // 첫 번째 문을 연 방법 (0 또는 1)

        // 총 문이 5개를 초과하면 탈출이 불가능
        if (n > 5 || n < 2) {
            System.out.print("Love is open door");
        } else {
            // 두 번째 문부터 마지막 문까지 규칙에 맞춰 출력
            for (int i = 0; i < n-1; i++) {
                // 현재 방법과 다른 방법을 선택
                firstMethod = 1 - firstMethod;
                System.out.println(firstMethod);
            }
        }
        s.close();
    }
}
