import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main step = new Main();
    step.a();
  }
  void a() {
    Scanner s = new Scanner(System.in);
    char n[][] = new char[5][15];
    int max=0;
		for(int i=0; i<5; i++) {
			String str = s.nextLine();
			max = Math.max(max, str.length());
			for(int j=0; j<str.length(); j++)
				n[i][j] = str.charAt(j);
		}
    for (int j=0; j<max; j++){
      for(int i=0; i<5; i++) {
        if(n[i][j] == '\0')continue;
        System.out.print(n[i][j]);
      }
    }
  }
}