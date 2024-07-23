import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

/**
 * Author : YoungSeo Jeon
 * Date : 2021-09-24
 * Description : 백준
 */

public class Main {
    // Comparable을 이용하여 영어와 숫자를 저장하는 Word 객체 정의
    public static class Word implements Comparable<Word> {
        int number;
        String wordStr;

        Word(String wordStr, int number) {
            this.number = number;
            this.wordStr = wordStr;
        }

        // wordStr을 기준으로 정렬
        @Override
        public int compareTo(Word o) {
            return this.wordStr.compareTo(o.wordStr);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        // M과 N 입력
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        String[] numberWords = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        ArrayList<Word> list = new ArrayList<>();
        
        // M부터 N까지의 숫자를 변환하여 리스트에 추가
        for (int i = M; i <= N; i++) {
            StringBuilder sb = new StringBuilder();
            // 숫자를 문자열로 변환 후, 각 자리 숫자를 영어 단어로 변환
            char[] temp = Integer.toString(i).toCharArray();
            for (char c : temp) {
                sb.append(numberWords[c - '0']).append(" ");
            }
            // 리스트에 원본 숫자와 함께 추가
            list.add(new Word(sb.toString().trim(), i));
        }

        // 리스트를 wordStr을 기준으로 정렬
        Collections.sort(list);

        // 정렬된 결과를 10개씩 출력
        int count = 0;
        for (Word word : list) {
            bw.write(word.number + " ");
            count++;
            if (count % 10 == 0) bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
