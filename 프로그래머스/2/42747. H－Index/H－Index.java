import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        // 인용 횟수를 정렬합니다.
        Arrays.sort(citations);
        
        int n = citations.length;
        
        // H-Index를 찾기 위해 반복합니다.
        for (int i = 0; i < n; i++) {
            // h번 이상 인용된 논문의 개수
            int h = n - i;
            
            if (citations[i] >= h) {
                return h;
            }
        }
        
        return 0;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        
        // 테스트 케이스
        System.out.println(sol.solution(new int[]{3, 0, 6, 1, 5}));  // 3
    }
}
