package SlidingWindow;

// import Queue.window;

// max subarray sum of size k
public class maxSubarraySum {
    public static int maxSubarraySum(int[] arr, int k) {
        int n=arr.length;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<n-k+1;i++)
        {
            int curSum=0;
            for(int j=i;j<i+k;j++)
            {
                curSum+=arr[j];
            }
            maxSum=Math.max(maxSum,curSum);
        }
        return maxSum;
    }
    public static int SW(int arr[], int k)
    {
       int n=arr.length;
       int maxSum=0;
       int windowSum=0;
       for(int i=0;i<k;i++) windowSum+=arr[i];
       maxSum=Math.max(maxSum,windowSum);
       int i=0; 
       int j=k-1;
       while(j<n)
       {
            windowSum=windowSum-arr[i]+arr[j];
            maxSum=Math.max(maxSum,windowSum);
            i++;
            j++;
       }
       return maxSum;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int k=3;
        System.out.println(maxSubarraySum(arr,k));
        System.out.println(SW(arr,k));
    }   
}