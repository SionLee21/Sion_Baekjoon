import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(); 
        int m = s.nextInt(); 
        int minCost = Integer.MAX_VALUE;
        int minOne=Integer.MAX_VALUE;
        int minSix=Integer.MAX_VALUE;
        int cost=Integer.MAX_VALUE;
        for (int i = 0; i < m; i++) {
          int six = s.nextInt(); 
          int one = s.nextInt(); 
          minOne = Math.min(minOne,one);
          minSix = Math.min(minSix,six);
          cost = Math.min(((n + 5) / 6) * six, n * one);
          minCost = Math.min(minCost, cost);
        }
        cost=n/6*minSix;
        cost+=n%6*minOne;
        minCost = Math.min(minCost, cost);
        System.out.println(minCost);
        s.close();
    }
}