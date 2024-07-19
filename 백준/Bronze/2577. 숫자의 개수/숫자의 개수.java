import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int given = s.nextInt() * s.nextInt() * s.nextInt();
        s.close();

        int[] digitCounts = new int[10];

        // 각 자리 숫자의 빈도를 세기
        while (given > 0) {
            int digit = given % 10;
            digitCounts[digit]++;
            given /= 10;
        }

        for (int count : digitCounts) {
            System.out.println(count);
        }
    }
}
