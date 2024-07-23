import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        int[][] people = new int[N][2];
        
        for (int i = 0; i < N; i++) {
            people[i][0] = scanner.nextInt(); // 몸무게
            people[i][1] = scanner.nextInt(); // 키
        }
        
        int[] ranks = new int[N];
        
        for (int i = 0; i < N; i++) {
            int rank = 1; // 기본 등수는 1
            for (int j = 0; j < N; j++) {
                if (i != j && people[j][0] > people[i][0] && people[j][1] > people[i][1]) {
                    rank++; // 자신보다 큰 덩치를 찾으면 등수를 증가시킴
                }
            }
            ranks[i] = rank;
        }
        
        for (int rank : ranks) {
            System.out.print(rank + " ");
        }
    }
}
