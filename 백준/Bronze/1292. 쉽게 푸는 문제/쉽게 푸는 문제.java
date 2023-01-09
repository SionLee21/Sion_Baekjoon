import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Main step = new Main();
    step.a();
  }
  void a(){
    Scanner s = new Scanner(System.in);
    int n=s.nextInt();
    int index=s.nextInt();
    int result=0;
    int cnt=0;
    int list[]=new int[1000];
    for(int i=0; i<1000; i++){
      for (int j = 0; j < i; j++){
        if (cnt == 1000) break;
      			list[cnt] = i;
      			cnt++;
      }
    }
    for(int i=n-1; i<index; i++) result+=list[i];
    System.out.print(result);
  }
}