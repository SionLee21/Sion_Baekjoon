import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int price_Y = 0;
        int price_M = 0;

        for (int i = 0; i < n; i++) {
            int usage = s.nextInt();
            price_Y  += (usage / 30 + 1) * 10;// Y 요금제: 30초마다 10원
            price_M += (usage / 60 + 1) * 15; // M 요금제: 60초마다 15원
        }

        if (price_Y < price_M)
            System.out.print("Y " + price_Y);
        else if (price_Y > price_M)
            System.out.print("M " + price_M);
        else
            System.out.print("Y M " + price_Y);
    }
}
