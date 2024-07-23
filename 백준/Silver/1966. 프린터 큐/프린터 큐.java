import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();

        for (int t = 0; t < testCases; t++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            Queue<int[]> queue = new LinkedList<>();
            PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((a, b) -> b - a);

            for (int i = 0; i < n; i++) {
                int importance = scanner.nextInt();
                queue.add(new int[]{importance, i});
                priorityQueue.add(importance);
            }

            int printOrder = 0;
            while (!queue.isEmpty()) {
                int[] current = queue.poll();

                if (current[0] == priorityQueue.peek()) {
                    priorityQueue.poll();
                    printOrder++;

                    if (current[1] == m) {
                        System.out.println(printOrder);
                        break;
                    }
                } else {
                    queue.add(current);
                }
            }
        }

        scanner.close();
    }
}
