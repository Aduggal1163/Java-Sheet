// 1493
class Solution {
    public int longestSubarray(int[] arr) {
        int i = 0, zeroes = 0, maxLen = 0;
        int n = arr.length;
        
        for (int j = 0; j < n; j++) {
            if (arr[j] == 0) zeroes++;
            
            while (zeroes > 1) {
                if (arr[i] == 0) zeroes--;
                i++;
            }
            
            maxLen = Math.max(maxLen, j - i);
        }
        
        return maxLen;
    }
}
