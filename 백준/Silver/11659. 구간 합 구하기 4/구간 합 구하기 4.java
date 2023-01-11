import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
    int n=s.nextInt();
    int m=s.nextInt();
    int[]list=new int[n+1];
    for (int i=1; i<=n; i++){
      list[i]=s.nextInt();
      list[i]+=list[i-1];
    }
    for (int i=0; i<m; i++){ 
      int result=0;
      int start=s.nextInt();
      int end=s.nextInt();
      result=list[end]-list[start-1];
      System.out.println(result);
    }
  }
}