import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Main step = new Main();
    step.a();
  }
  void a(){
    Scanner s = new Scanner(System.in);
    String r[]=new String[3];
    for (int j=0; j<3; j++){
      int c=0;
      for (int i=0; i<4; i++){
        int y=s.nextInt();
        if(y==1)c++;
      }
      if (c==0) r[j]="D";
      else if(c==1) r[j]="C";
      else if(c==2) r[j]="B";
      else if(c==3) r[j]="A";
      else r[j]="E"; 
    }
    for (int j=0; j<3; j++)System.out.println(r[j]);
  }
}