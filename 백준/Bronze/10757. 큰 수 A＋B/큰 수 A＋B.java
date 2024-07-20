import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BigInteger A = new BigInteger(s.next());
        BigInteger B = new BigInteger(s.next());

        /*
         * add() 메소드는 해당 BigInteger 객체와 파라미터(인자)로 들어온
         * BigInteger객체의 더한 값을 BigInteger 타입으로 반환한다.
         */
        A = A.add(B);
        System.out.print(A);
    }
}
