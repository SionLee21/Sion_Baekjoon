import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Main ll=new Main();
    ll.baekjoon();
  }
  void baekjoon(){
    Scanner s=new Scanner(System.in);
    int i,k,n;
    int test=s.nextInt();
    for (i=0; i<test; i++){ 
      System.out.println(num(k=s.nextInt(),n=s.nextInt()));
    }
  }
  int num(int k,int n){
    if (k==0) return n;
    if (n==0) return 0;
    else return num(k,n-1)+num(k-1,n);
  }
}