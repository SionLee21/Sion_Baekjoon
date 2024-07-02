import java.util.Arrays;
//그리디 쓰기
class Solution {
    public int solution(int[] people, int limit) {
        Arrays.sort(people); // 몸무게 순으로 정렬합니다.
        
        int i = 0; // 가장 가벼운 사람의 인덱스
        int j = people.length - 1; // 가장 무거운 사람의 인덱스
        int boats = 0; // 필요한 구명보트 수
        
        while (i <= j) {
            // 가장 무거운 사람과 가장 가벼운 사람을 함께 태울 수 있는지 확인합니다.
            if (people[i] + people[j] <= limit) {
                i++; // 가장 가벼운 사람을 태웠으므로 다음 가벼운 사람으로 이동
            }
            j--; // 무거운 사람을 태웠으므로 다음 무거운 사람으로 이동
            boats++; // 구명보트 수를 증가시킵니다.
        }
        
        return boats;
    }
}
