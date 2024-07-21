import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int mood = s.nextInt();
        
        double pGG = s.nextDouble(); // 기분이 좋은 날 다음 날도 기분이 좋은 날일 확률
        double pGS = s.nextDouble(); // 기분이 좋은 날 다음 날 기분이 싫은 날일 확률
        double pSG = s.nextDouble(); // 기분이 싫은 날 다음 날 기분이 좋은 날일 확률
        double pSS = s.nextDouble(); // 기분이 싫은 날 다음 날도 기분이 싫은 날일 확률
        
        // 초기 상태 벡터
        double[] state = new double[2];
        if (mood == 0) {
            state[0] = 1.0;
            state[1] = 0.0;
        } else {
            state[0] = 0.0;
            state[1] = 1.0;
        }
        
        // 전이 행렬
        double[][] transitionMatrix = {
            {pGG, pGS},
            {pSG, pSS}
        };
        
        // N일 후의 상태 계산
        for (int day = 0; day < N; day++) {
            double newGood = state[0] * transitionMatrix[0][0] + state[1] * transitionMatrix[1][0];
            double newBad = state[0] * transitionMatrix[0][1] + state[1] * transitionMatrix[1][1];
            state[0] = newGood;
            state[1] = newBad;
        }
        
        // 확률에 1000을 곱하고 반올림
        int goodDaysProbability = (int)Math.round(state[0] * 1000);
        int badDaysProbability = (int)Math.round(state[1] * 1000);
        
        System.out.println(goodDaysProbability);
        System.out.println(badDaysProbability);
    }
}
