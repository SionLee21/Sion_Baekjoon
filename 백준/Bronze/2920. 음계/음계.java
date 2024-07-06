import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] notes = new int[8];

        for (int i = 0; i < 8; i++) {
            notes[i] = scanner.nextInt();
        }

        boolean ascending = true;
        boolean descending = true;

        for (int i = 1; i < notes.length; i++) {
            if (notes[i] > notes[i - 1]) {
                descending = false;
            } else if (notes[i] < notes[i - 1]) {
                ascending = false;
            }
        }

        if (ascending) {
            System.out.println("ascending");
        } else if (descending) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }

        scanner.close();
    }
}
