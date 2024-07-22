import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Set<Integer> numbers = new TreeSet<>();

        for (int i = 0; i < N; i++) {
            int number = scanner.nextInt();
            numbers.add(number);
        }
        scanner.close();

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
