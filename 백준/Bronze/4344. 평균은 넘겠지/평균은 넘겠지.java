import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main step = new Main();
    step.a();
  }
  void a() {
    Scanner s = new Scanner(System.in);
    int sco[] = new int[1000];
    int num=s.nextInt();
    int j;
    int count=0;
    int total=0;
		for(int i=0; i<num; i++) {
      count=0;
      total=0;
      int st=s.nextInt();
      for(j=0; j<st; j++){
			  sco[j] = s.nextInt();
        total+=sco[j];
      }
      double avg=total/j;
      for(int k=0; k<st; k++) if(sco[k]>avg) count++;
        avg=((double)count/st*100);
        System.out.printf("%.3f%%\n",avg);
    }
  }
}