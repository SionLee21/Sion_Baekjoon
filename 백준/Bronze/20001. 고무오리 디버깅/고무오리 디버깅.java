import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str=s.nextLine();
        int count=0;
            while (!(str.equals("고무오리 디버깅 끝"))) {
                str = s.nextLine();
                if (count == 0 && str.equals("고무오리")) count += 2;
                else if (str.equals("고무오리")) count--;
                else if (str.equals("문제"))count++;
        }
        if (count==0)System.out.print("고무오리야 사랑해");
        else System.out.print("힝구");
    }
}