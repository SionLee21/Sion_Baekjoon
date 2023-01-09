import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Main stepC = new Main();
    stepC.c11();
  }
  void c11(){
    Scanner s = new Scanner(System.in);
    int year=s.nextInt();
    int index=0;
    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) index=1;
    System.out.print(index);
  }
}