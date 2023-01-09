import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
    HashSet<String> set = new HashSet<>();
    ArrayList<String> duplicates = new ArrayList<>();
    Scanner s = new Scanner(System.in);
    int D = s.nextInt();
    int N = s.nextInt();
    String New;
    for (int i = 0; i < D; i++) {
      set.add(s.next());
    }
    for (int j = 0; j < N; j++) {
      New = s.next();
      if (set.contains(New)) {
        duplicates.add(New);
      }
    }
    Collections.sort(duplicates);
    System.out.println(duplicates.size());
    for (String duplicate : duplicates) {
      System.out.println(duplicate);
    }
  }
}