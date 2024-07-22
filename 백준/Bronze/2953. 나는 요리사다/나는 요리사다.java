import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {
        int max[] = {0,0};
        Scanner s = new Scanner(System.in);
        for (int i=0; i<5; i++){
            int num = s.nextInt() + s.nextInt() +s.nextInt() +s.nextInt() ;
            if (num > max[0]){
                max[0] = num;
                max[1] = i+1;
                if (num == 20) {
                    System.out.print(i + 1 + " " + 20);
                    exit(0);
                }
            }
        }
        System.out.println(max[1] + " " + max[0]);
        s.close();
    }
}
