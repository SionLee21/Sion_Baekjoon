import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      int i,total=0;
      int input=s.nextInt();
      int []arr1=new int[input];
      Integer[] arr2 = new Integer[input];
      for (i=0; i<input; i++){
        arr1[i]=s.nextInt();
      }
      for (i=0; i<input; i++){
        arr2[i]=s.nextInt();
      }
      Arrays.sort(arr1);
      Arrays.sort(arr2,Collections.reverseOrder());
      for (i=0; i<input; i++)
      total+=(arr1[i]*arr2[i]);
      System.out.printf("%d",total);
      s.close();
    }
}