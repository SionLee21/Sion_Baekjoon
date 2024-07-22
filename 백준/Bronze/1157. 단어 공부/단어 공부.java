import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toUpperCase();
        scanner.close();

        int[] frequency = new int[26];
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                frequency[ch - 'A']++;
            }
        }

        int maxFreq = -1;
        char mostFreqChar = '?';
        boolean isTie = false;

        for (int i = 0; i < 26; i++) {
            if (frequency[i] > maxFreq) {
                maxFreq = frequency[i];
                mostFreqChar = (char) (i + 'A');
                isTie = false;
            } else if (frequency[i] == maxFreq) {
                isTie = true;
            }
        }

        if (isTie) {
            System.out.println('?');
        } else {
            System.out.println(mostFreqChar);
        }
    }
}
