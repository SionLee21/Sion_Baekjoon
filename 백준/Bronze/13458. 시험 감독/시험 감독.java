import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int input,first_num,back_num;
        input=s.nextInt();
        long count=input;
        int student_list[]=new int [input];
        for(int i=0; i<input; i++){
            student_list[i]=s.nextInt();
        }
        first_num=s.nextInt();
        back_num=s.nextInt();
        for(int i=0; i<input; i++){
            student_list[i]-=first_num;
            if(student_list[i]>0)
            count+=Math.ceil((double)student_list[i]/back_num);
        }
        System.out.print(count);
    }
}