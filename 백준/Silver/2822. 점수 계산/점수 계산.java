import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<int[]> scores = new ArrayList<>();
        
        for (int i = 1; i <= 8; i++) {
            int score = scanner.nextInt();
            scores.add(new int[]{score, i});
        }
        
        scanner.close();
        
        // 점수를 내림차순으로 정렬
        Collections.sort(scores, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[0] - o1[0];
            }
        });
        
        int totalScore = 0;
        List<Integer> problems = new ArrayList<>();
        
        // 상위 5개의 점수를 합산하고, 문제 번호를 저장
        for (int i = 0; i < 5; i++) {
            totalScore += scores.get(i)[0];
            problems.add(scores.get(i)[1]);
        }
        
        // 문제 번호를 오름차순으로 정렬
        Collections.sort(problems);
        
        // 출력
        System.out.println(totalScore);
        for (int problem : problems) {
            System.out.print(problem + " ");
        }
    }
}
