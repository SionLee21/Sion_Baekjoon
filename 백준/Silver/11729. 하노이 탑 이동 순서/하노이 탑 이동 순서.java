import java.util.Scanner;

public class Main {
  static int N;
  static StringBuilder b = new StringBuilder();
  static void move(int n, int from, int by, int to) {
      if (n == 1) {
        b.append(from + " " + to + "\n");
        return;
      }
      move(n - 1, from, to, by);
      b.append(from + " " + to + "\n");
      move(n - 1, by, from, to);
  }
  
  public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      N = s.nextInt();
      System.out.println((int) Math.pow(2, N) - 1);
      move(N, 1, 2, 3);
      System.out.println(b);
  }
}