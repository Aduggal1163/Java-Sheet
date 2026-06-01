Maximum sum of subarray less than or equal to x
class Solution {
    public long findMaxSubarraySum(int[] arr, long x) {
        // Your code goes here
        int left=0;
        int right=0;int sum=0;int maxSum=0;
        int start=0;
        for(right=0;right<arr.length;right++)
        {
            sum+=arr[right];
            while(sum>x){
                sum-=arr[left];
                left++;
            }
            if(sum<=x)
            {
                maxSum=Math.max(maxSum,sum);
                start=left;
            }
        }
        return maxSum;
    }
}