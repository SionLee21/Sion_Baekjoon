import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        scanner.close();

        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            list.add(i);
        }

        StringBuilder result = new StringBuilder();
        result.append("<");

        int index = 0;
        while (!list.isEmpty()) {
            index = (index + K - 1) % list.size();
            result.append(list.remove(index));
            if (!list.isEmpty()) {
                result.append(", ");
            }
        }

        result.append(">");
        System.out.println(result.toString());
    }
}
