package SlidingWindow;

public class MinSizeSubarray {
    // lc 209
    class Solution {
        public int minSubArrayLen(int target, int[] nums) {
            int n=nums.length;
            int sum=0;
            int i=0;
            int j=0;
            int minLen=Integer.MAX_VALUE;
            while(j<n && sum<target)
            {
                sum+=nums[j];
                j++;
            }
            j--;
            while(i<n && j<n)
            {
                int len=j-i+1;
                if(sum>=target)minLen=Math.min(minLen,len);
                sum-=nums[i];
                i++;
                j++;
                while(j<n && sum<target)
                {
                sum+=nums[j];
                j++;
                }
                j--;
            }
            if(minLen==Integer.MAX_VALUE) return 0;
            else return minLen;
        }
    }
}
