import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        Map<String, Integer> bookCount = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String book = scanner.nextLine();
            bookCount.put(book, bookCount.getOrDefault(book, 0) + 1);
        }

        int maxCount = 0;
        ArrayList<String> mostSoldBooks = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : bookCount.entrySet()) {
            int count = entry.getValue();
            String book = entry.getKey();

            if (count > maxCount) {
                maxCount = count;
                mostSoldBooks.clear();
                mostSoldBooks.add(book);
            } else if (count == maxCount) {
                mostSoldBooks.add(book);
            }
        }

        Collections.sort(mostSoldBooks);
        System.out.println(mostSoldBooks.get(0));
        
        scanner.close();
    }
}
