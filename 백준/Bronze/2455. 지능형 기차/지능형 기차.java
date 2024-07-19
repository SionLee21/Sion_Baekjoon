import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int now = 0; // 초기 승객 수
        int max = 0;

        // 각 역에서 승객 수를 업데이트하고 최대 승객 수를 기록
        for (int i = 0; i < 4; i++) {
            int off = s.nextInt(); // 내린 승객 수
            int on = s.nextInt();  // 탄 승객 수
            now = now + on - off;  // 현재 승객 수 업데이트
            if (now>max){
                max=now;
            }
        }
        System.out.print(max);
    }
}
