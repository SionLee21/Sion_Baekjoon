import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Main stepJ = new Main();
        stepJ.j06();}
    void j06() {
      Scanner s = new Scanner(System.in);
      int i = s.nextInt();
      System.out.printf("%d",fibonacci(i));}
  int fibonacci(int n){
    if ( n <= 1 )return n;
    return fibonacci(n - 1) + fibonacci(n - 2);}
}