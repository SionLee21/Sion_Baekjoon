class Solution {
    public int solution(String s) {
       int n = s.length();
        int minLength = n; // Initialize with the maximum possible length of the string

        // Iterate chunk sizes from 1 to n//2
        for (int size = 1; size <= n / 2; size++) {
            StringBuilder compressed = new StringBuilder();
            String prevChunk = s.substring(0, size); // Initialize the first chunk
            int count = 1;

            // Iterate through the string in chunks of 'size'
            for (int i = size; i < n; i += size) {
                int end = Math.min(i + size, n);
                String currentChunk = s.substring(i, end);
                if (currentChunk.equals(prevChunk)) {
                    count++;
                } else {
                    if (count > 1) {
                        compressed.append(count).append(prevChunk);
                    } else {
                        compressed.append(prevChunk);
                    }
                    prevChunk = currentChunk;
                    count = 1;
                }
            }

            // Append the last processed chunk
            if (count > 1) {
                compressed.append(count).append(prevChunk);
            } else {
                compressed.append(prevChunk);
            }

            // Update minimum length
            minLength = Math.min(minLength, compressed.length());
        }

        return minLength;
    }
}
