import java.util.Scanner;
import java.util.Arrays;
class Main {
  public static void main(String[] args) {
    Main step = new Main();
    step.a();
  }
  void a(){
    Scanner s = new Scanner(System.in);
    int n[]=new int[10];
    int index=s.nextInt();
    for (int j=0; j<index; j++){
      for(int i=0; i<10; i++){
        n[i]=s.nextInt();
        }
      Arrays.sort(n);
      System.out.println(n[7]);
    }
  }
}