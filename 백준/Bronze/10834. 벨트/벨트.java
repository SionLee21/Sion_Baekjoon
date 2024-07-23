import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        
        // 분모와 분자를 정의
        long numerator = 1;
        long denominator = 1;
        boolean clockwise = true;  // true: 시계방향, false: 반시계방향
        
        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());

            // 회전 방향 결정
            if (s == 1) {
                clockwise = !clockwise;
            }

            // 회전 비율 업데이트
            numerator *= b;
            denominator *= a;
            
            // 기약분수로 변환
            long gcd = gcd(numerator, denominator);
            numerator /= gcd;
            denominator /= gcd;
        }
        
        // 최종 분수와 방향 출력
        System.out.println((clockwise ? 0 : 1) + " " + (numerator / denominator));
    }

    // 최대 공약수 계산 함수
    private static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
