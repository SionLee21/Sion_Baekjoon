import java.util.Scanner;
import java.util.Arrays;
public class Main {
	public static void main(String[] args) {		
		Scanner s = new Scanner(System.in);
		int c = s.nextInt();
		String[][] arr = new String[c][2];
		for(int i = 0; i < c; i++) {
			arr[i][0] = s.next();	
			arr[i][1] = s.next();	
		}
        Arrays.sort(arr, (s1, s2) -> Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]));
        for(int i = 0; i < c; i++) System.out.printf("%s %s\n",arr[i][0],arr[i][1]);
	}
}