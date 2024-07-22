import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        scanner.close();

        int totalTime = 0;

        for (char c : word.toCharArray()) {
            totalTime += getDialTime(c);
        }

        System.out.println(totalTime);
    }

    private static int getDialTime(char c) {
        if (c >= 'A' && c <= 'C') {
            return 3;
        } else if (c >= 'D' && c <= 'F') {
            return 4;
        } else if (c >= 'G' && c <= 'I') {
            return 5;
        } else if (c >= 'J' && c <= 'L') {
            return 6;
        } else if (c >= 'M' && c <= 'O') {
            return 7;
        } else if (c >= 'P' && c <= 'S') {
            return 8;
        } else if (c >= 'T' && c <= 'V') {
            return 9;
        } else if (c >= 'W' && c <= 'Z') {
            return 10;
        } else {
            return 0;
        }
    }
}
