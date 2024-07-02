class Solution {
    public String solution(String number, int k) {
        // 결과를 담을 스택처럼 사용할 StringBuilder
        StringBuilder result = new StringBuilder();
        int length = number.length();
        
        // 현재 만들고자 하는 숫자의 길이
        int newLength = length - k;
        
        for (int i = 0; i < length; i++) {
            char c = number.charAt(i);
            // 결과의 끝에 위치한 문자보다 현재 문자가 더 크고
            // 남은 자릿수가 충분하다면 끝 문자를 제거하고 현재 문자를 추가
            while (result.length() > 0 && result.charAt(result.length() - 1) < c && k > 0) {
                result.deleteCharAt(result.length() - 1);
                k--;
            }
            result.append(c);
        }
        
        // 최종적으로 원하는 길이만큼 자른다.
        return result.substring(0, newLength).toString();
    }
}