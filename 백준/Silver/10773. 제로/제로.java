import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < K; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num == 0) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(num);
            }
        }

        int sum = 0;
        for (int value : stack) {
            sum += value;
        }

        System.out.println(sum);
    }
}
