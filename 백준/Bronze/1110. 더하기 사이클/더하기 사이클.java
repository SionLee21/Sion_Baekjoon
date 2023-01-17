import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int input,first_num,back_num,new_num,count=0;
        input=s.nextInt();
        new_num=input;
        while(true) {
            first_num = new_num % 10;
            back_num = (int) (Math.floor(new_num / 10)); 
            new_num=(first_num+back_num)%10; 
            if(first_num<10) first_num=first_num*10;
            new_num=new_num+first_num; 
            count++;
            if(new_num==input)break;
        }
        System.out.print(count);
    }
}