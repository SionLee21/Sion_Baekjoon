import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Main ll=new Main();
    ll.baekjoon();
  }
  void baekjoon(){
    Scanner s=new Scanner(System.in);
    int N=s.nextInt();
    int[] result={0,0,0};    
    int[][] map=new int[N][N]; 
  	for (int i = 0; i < N; i++) {
  		for (int j = 0; j < N; j++) {  
  			int input=s.nextInt();	
  			map[i][j] = input;
  		}
  	}
  	divide(0, 0, N,map,result);
  	System.out.printf("%d\n%d\n%d", result[0], result[1], result[2]);
    }
  void divide(int row, int col, int N, int map[][],int result[]){
    if(check(row,col,N,map)) result[map[row][col]+=1]++;
    else {
      int size=N/3;
      for (int i = 0; i < 3; i++) {
			 for (int j = 0; j < 3; j++) {
				  divide(row + size * i, col + size * j, size,map,result);
			 }
		  }
    }
  }
  boolean check (int row, int col, int N, int map[][]){
    int start= map[row][col];
    for (int i = row; i < row + N; i++) {
		  for (int j = col; j < col + N; j++) {
        if (start != map[i][j])
				  return false;
      }
    }
    return true;
  }
}