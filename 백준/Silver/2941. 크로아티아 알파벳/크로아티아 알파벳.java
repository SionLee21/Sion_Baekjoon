import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        // 크로아티아 알파벳 목록
        String[] croatianAlphabets = {"dz=", "c=", "c-", "d-", "lj", "nj", "s=", "z="};

        // 크로아티아 알파벳 개수 카운트
        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            // 최대 3글자까지 비교 가능
            if (i + 2 < input.length() && input.substring(i, i + 3).equals("dz=")) {
                count++;
                i += 2; // 3글자 처리했으므로 2칸 건너뛴다
            } else if (i + 1 < input.length()) {
                String twoChar = input.substring(i, i + 2);
                boolean isCroatian = false;
                for (String croatian : croatianAlphabets) {
                    if (twoChar.equals(croatian)) {
                        count++;
                        i++; // 2글자 처리했으므로 1칸 건너뛴다
                        isCroatian = true;
                        break;
                    }
                }
                if (!isCroatian) {
                    count++;
                }
            } else {
                count++;
            }
        }

        System.out.println(count);
    }
}
