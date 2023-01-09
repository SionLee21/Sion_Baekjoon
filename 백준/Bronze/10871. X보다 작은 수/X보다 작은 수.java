import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Main step = new Main();
    step.a();
  }
  void a(){
    Scanner s = new Scanner(System.in);
    int n=s.nextInt();
    int x=s.nextInt();
    int index=0;
    int arr[]=new int[n];
    for (int i=0; i<n; i++){
      int num=s.nextInt();
      if (num<x) {
        arr[index]=num;
        index++;
      }
    }
    for (int i=0; i<index; i++) System.out.print(arr[i]+" ");
  }
}