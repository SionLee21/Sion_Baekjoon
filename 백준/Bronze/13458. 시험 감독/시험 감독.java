import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long input,first_num,back_num;
        input=s.nextLong();
        long count=input;
        long student_list[]=new long [1000000];
        for(int i=0; i<input; i++){
            student_list[i]=s.nextLong();
        }
        first_num=s.nextLong();
        back_num=s.nextLong();
        for(int i=0; i<input; i++){
            student_list[i]-=first_num;
            if(student_list[i]>0)
            count+=Math.ceil((double)student_list[i]/back_num);
        }
        System.out.print(count);
    }
}