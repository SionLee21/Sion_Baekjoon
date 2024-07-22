import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        scanner.close();

        int length = word.length();
        for (int i = 0; i < length; i += 10) {
            if (i + 10 < length) {
                System.out.println(word.substring(i, i + 10));
            } else {
                System.out.println(word.substring(i));
            }
        }
    }
}
