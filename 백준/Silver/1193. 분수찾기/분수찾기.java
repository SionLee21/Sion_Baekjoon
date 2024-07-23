import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());
        br.close();
        
        int diagonal = 1;
        int total = 1;
        
        // 대각선의 범위를 찾기 위한 루프
        while (total < X) {
            diagonal++;
            total += diagonal;
        }
        
        int prevTotal = total - diagonal;
        int pos = X - prevTotal;
        
        int numerator;
        int denominator;
        
        // 대각선이 홀수인지 짝수인지에 따라 위치 결정
        if (diagonal % 2 == 0) {
            numerator = pos;
            denominator = diagonal - pos + 1;
        } else {
            numerator = diagonal - pos + 1;
            denominator = pos;
        }
        
        System.out.println(numerator + "/" + denominator);
    }
}
