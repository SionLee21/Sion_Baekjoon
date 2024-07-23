import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String document = br.readLine();
        String word = br.readLine();
        
        int docLength = document.length();
        int wordLength = word.length();
        int count = 0;
        
        for (int i = 0; i <= docLength - wordLength; ) {
            if (document.substring(i, i + wordLength).equals(word)) {
                count++;
                i += wordLength;  // 단어를 찾으면 그 단어의 끝 이후부터 다시 검색
            } else {
                i++;  // 단어를 찾지 못하면 한 칸만 이동
            }
        }
        
        System.out.println(count);
    }
}
