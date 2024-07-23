import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int x1 = scanner.nextInt();
            int y1 = scanner.nextInt();
            int r1 = scanner.nextInt();
            int x2 = scanner.nextInt();
            int y2 = scanner.nextInt();
            int r2 = scanner.nextInt();

            double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
            double subtract = Math.abs(r1 - r2);

            int result;
            if (distance == 0 && r1 == r2) {
                result = -1;
            } else if (distance < r1 + r2 && subtract < distance) {
                result = 2;
            } else if (distance == r1 + r2 || distance == subtract) {
                result = 1;
            } else {
                result = 0;
            }
            System.out.println(result);
        }

        scanner.close();
    }
}
