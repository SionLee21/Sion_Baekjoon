import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // 개행 문자 소비
        
        int groupWordCount = 0;

        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            if (isGroupWord(word)) {
                groupWordCount++;
            }
        }

        System.out.println(groupWordCount);
    }

    private static boolean isGroupWord(String word) {
        Set<Character> seenCharacters = new HashSet<>();
        char prevChar = '\0';

        for (char ch : word.toCharArray()) {
            if (ch != prevChar) {
                if (seenCharacters.contains(ch)) {
                    return false;
                }
                seenCharacters.add(ch);
                prevChar = ch;
            }
        }
        return true;
    }
}
