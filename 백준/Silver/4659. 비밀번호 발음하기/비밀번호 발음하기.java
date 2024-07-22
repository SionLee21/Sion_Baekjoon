import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String password = scanner.nextLine();
            if (password.equals("end")) {
                break;
            }
            if (isAcceptable(password)) {
                System.out.println("<" + password + "> is acceptable.");
            } else {
                System.out.println("<" + password + "> is not acceptable.");
            }
        }
        scanner.close();
    }

    private static boolean isAcceptable(String password) {
        if (!containsVowel(password)) {
            return false;
        }
        if (hasThreeConsecutiveVowelsOrConsonants(password)) {
            return false;
        }
        if (hasInvalidDoubleLetters(password)) {
            return false;
        }
        return true;
    }

    private static boolean containsVowel(String password) {
        for (char c : password.toCharArray()) {
            if ("aeiou".indexOf(c) >= 0) {
                return true;
            }
        }
        return false;
    }

    private static boolean hasThreeConsecutiveVowelsOrConsonants(String password) {
        int vowelCount = 0;
        int consonantCount = 0;

        for (char c : password.toCharArray()) {
            if ("aeiou".indexOf(c) >= 0) {
                vowelCount++;
                consonantCount = 0;
            } else {
                consonantCount++;
                vowelCount = 0;
            }
            if (vowelCount >= 3 || consonantCount >= 3) {
                return true;
            }
        }
        return false;
    }

    private static boolean hasInvalidDoubleLetters(String password) {
        for (int i = 1; i < password.length(); i++) {
            char current = password.charAt(i);
            char previous = password.charAt(i - 1);
            if (current == previous && !(current == 'e' || current == 'o')) {
                return true;
            }
        }
        return false;
    }
}
