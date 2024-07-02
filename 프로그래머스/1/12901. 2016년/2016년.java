class Solution {
    public String solution(int a, int b) {
        int[] daysOfMonth = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] daysOfWeek = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        
        // 주어진 날짜까지의 총 일수 계산
        int totalDays = 0;
        for (int i = 1; i < a; i++) {
            totalDays += daysOfMonth[i];
        }
        totalDays += b - 1; // 주어진 일수를 더하고, 1월 1일이 0일째로 시작하므로 1을 뺀다.
        
        // 총 일수를 7로 나눈 나머지를 이용해 요일 계산
        String dayOfWeek = daysOfWeek[totalDays % 7];
        
        return dayOfWeek;
    }
}