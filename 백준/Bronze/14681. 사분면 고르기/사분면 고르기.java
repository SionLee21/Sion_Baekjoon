import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Main step = new Main();
    step.a();
  }
  void a(){
    Scanner s = new Scanner(System.in);
    int x=s.nextInt();
    int y=s.nextInt();
    int index=0;
    if (x>=0&&y>=0) index=1;
    else if (x<=0&&y>=0) index=2;
    else if (x<=0&&y<=0) index=3;
    else if (x>=0&&y<=0) index=4;
    System.out.print(index);
  }
}