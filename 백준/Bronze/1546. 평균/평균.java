import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int input=s.nextInt();
        double total=0;
        int max=0,i;
        int []list=new int[input];
        for(i=0; i<input; i++) {
            list[i] = s.nextInt();
            if(list[i]>=max) max=list[i];
        }
        for(i=0; i<input; i++) {
            total+=((double)list[i]/max*100);
        }
        System.out.print(total/input);
    }
}