import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Main step = new Main();
        step.a();
    }
    void a() {
        Scanner s = new Scanner(System.in);
        int total =0;
        for(int i=0; i<5; i++) {
            int num = s.nextInt();
            total+= num*num;
        }
        System.out.printf("%d\n",total%10);
    }
}