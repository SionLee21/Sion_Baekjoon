import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        scanner.close();

        // 모든 접미사를 저장할 리스트 생성
        ArrayList<String> suffixes = new ArrayList<>();

        // 모든 접미사 생성
        for (int i = 0; i < S.length(); i++) {
            suffixes.add(S.substring(i));
        }

        // 접미사를 사전순으로 정렬
        Collections.sort(suffixes);

        // 정렬된 접미사 출력
        for (String suffix : suffixes) {
            System.out.println(suffix);
        }
    }
}
