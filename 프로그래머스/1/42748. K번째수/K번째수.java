import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for (int idx = 0; idx < commands.length; idx++) {
            int i = commands[idx][0];
            int j = commands[idx][1];
            int k = commands[idx][2];
            
            // 부분 배열을 자르고 정렬합니다.
            int[] subArray = Arrays.copyOfRange(array, i - 1, j);
            Arrays.sort(subArray);
            
            // k번째 숫자를 저장합니다.
            answer[idx] = subArray[k - 1];
        }
        
        return answer;
    }   
}