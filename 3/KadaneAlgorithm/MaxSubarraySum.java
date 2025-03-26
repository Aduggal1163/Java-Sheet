package KadaneAlgorithm;

public class MaxSubarraySum {
    public static int BruteForce(int[] arr)
    {
        int maxSum=Integer.MIN_VALUE;
        for(int start=0;start<arr.length;start++)
        {
            int curSum=0;
            for(int end=start;end<arr.length;end++)
            {
                curSum+=arr[end];
                maxSum=Math.max(curSum,maxSum);
            }
        }
        return maxSum;
    }
    public static int KadaneAlgorithm(int arr[])
    {
        int maxSum=Integer.MIN_VALUE;
        int curSum=0;
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            curSum+=arr[i];
            maxSum=Math.max(maxSum, curSum);
            if(curSum<0) curSum=0;
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int arr[]={3,-4,5,4,-1,7,-8};
        System.out.println(BruteForce(arr));        
        System.out.println(KadaneAlgorithm(arr));
    }
}
