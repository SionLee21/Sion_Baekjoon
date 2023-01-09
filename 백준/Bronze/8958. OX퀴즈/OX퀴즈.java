import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int numTestCases = s.nextInt();
    for (int i = 0; i < numTestCases; i++) {
      String quizResult = s.next();
      int score = 0;
      int streak = 0;
      for (int j = 0; j < quizResult.length(); j++) {
        if (quizResult.charAt(j) == 'O') {
          streak++;
          score += streak;
        } else {
          streak = 0;
        }
      }
      System.out.println(score);
    }
  }
}