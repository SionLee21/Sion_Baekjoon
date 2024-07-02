class Solution {
    boolean solution(String s) {
        int p_count = 0, y_count = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'p' || c == 'P') {
                p_count++;
            } else if (c == 'y' || c == 'Y') {
                y_count++;
            }
        }

        return p_count == y_count;
    }
}