class Solution {
    public int solution(int[] cookie) {
        int maxSum = 0;
        int n = cookie.length;

        // m을 기준으로 양쪽을 나누어 살펴봅니다.
        for (int m = 0; m < n - 1; m++) {
            int leftSum = cookie[m];
            int rightSum = cookie[m + 1];
            int left = m;
            int right = m + 1;

            // 양쪽의 합이 같은 경우를 찾습니다.
            while (left >= 0 && right < n) {
                if (leftSum == rightSum) {
                    maxSum = Math.max(maxSum, leftSum);
                }
                if (leftSum <= rightSum && left > 0) {
                    leftSum += cookie[--left];
                } else if (leftSum > rightSum && right < n - 1) {
                    rightSum += cookie[++right];
                } else {
                    break;
                }
            }
        }

        return maxSum;
    }
}