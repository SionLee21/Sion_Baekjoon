import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] times = new int[n];

        for (int i = 0; i < n; i++) {
            times[i] = s.nextInt();
        }

        int yCost = 0;
        int mCost = 0;

        for (int time : times) {
            yCost += (time / 30 + 1) * 10;
            mCost += (time / 60 + 1) * 15;
        }

        if (yCost < mCost) {
            System.out.println("Y " + yCost);
        } else if (mCost < yCost) {
            System.out.println("M " + mCost);
        } else {
            System.out.println("Y M " + yCost);
        }
    }
}
