import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Main step = new Main();
    step.a();
  }
  void a(){
    Scanner s = new Scanner(System.in);
    int hour=s.nextInt();
    int min=s.nextInt();
    if (min<45){
      if(hour==0) hour=24;
      min=60-45+min;
      hour--;
    }
    else min=min-45;
    System.out.print(hour+" "+min);
  }
}