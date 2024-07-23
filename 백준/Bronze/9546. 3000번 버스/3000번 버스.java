import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 수
        
        for (int t = 0; t < T; t++) {
            int k = Integer.parseInt(br.readLine()); // 정류장 수
            int passengers = 0; // 마지막 정류장에서의 승객 수
            
            // 정류장을 거꾸로 추적하여 초기 승객 수를 계산
            for (int i = 0; i < k; i++) {
                passengers = (passengers * 2) + 1;
            }
            
            System.out.println(passengers);
        }
    }
}
