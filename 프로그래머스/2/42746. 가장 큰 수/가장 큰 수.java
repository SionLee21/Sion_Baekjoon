import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String solution(int[] numbers) {
        // 숫자를 문자열 배열로 변환
        String[] strNumbers = Arrays.stream(numbers)
                                    .mapToObj(String::valueOf)
                                    .toArray(String[]::new);

        // 커스텀 비교기준을 사용하여 문자열 정렬
        Arrays.sort(strNumbers, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return (b + a).compareTo(a + b);
            }
        });

        // 정렬된 문자열 배열을 하나의 문자열로 합침
        String result = String.join("", strNumbers);

        // 모든 값이 0인 경우 "0" 반환
        if (result.startsWith("0")) {
            return "0";
        }

        return result;
    }

}
