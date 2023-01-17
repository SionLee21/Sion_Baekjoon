import java.util.Scanner;
public class Main {
    static Scanner s = new Scanner(System.in);
    static int input=s.nextInt();
    static int []day=new int[input];
    static int []money=new int[input];
    static int total;
    public static void main(String[] args) {

        for (int i = 0; i < input; i++) {
            day[i] = s.nextInt();
            money[i] = s.nextInt();
        }
        dfs(0,0);
        System.out.print(total);
    }
    private static void dfs(int index, int value) {
        if (index >= input) {
            total = Math.max(total, value);
            return;
        }
        // 해당 index를 포함
        if (index + day[index] <= input) dfs(index + day[index], value + money[index]);
        else dfs(index + day[index], value); // n을 넘어가면 value 합치지 않음
        dfs(index + 1, value); // 해당 index 미포함
    }
}