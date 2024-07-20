import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(); 
        int total = 0;

        for (int i = 0; i < n; i++) {
            int plug = s.nextInt(); 
            if (i == n - 1) {
                total += plug;
            } else {
                total += plug-1;
            }
        }
        System.out.print(total);
    }
}
