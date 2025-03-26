public class cw {
    public static int maxSubarraySum(int[] arr, int k)
    {
        int i=0;
        int j=k-1;
        int n=arr.length;
        int maxSum=Integer.MIN_VALUE;
        int slidingSum=0;
        for(int a=0;a<=k-1;a++)
        {
            slidingSum+=arr[a];
        }
        i++;
        j++;
        while(j<n)
        {
            slidingSum=slidingSum-arr[i-1]+arr[j];
            maxSum=Math.max(maxSum,slidingSum);
            i++;
            j++;
        }

        return maxSum;
    }
    public static void findMaxLength(int[] arr, int target)
    {
        int left=0;
        int right=0;int sum=0;int maxLength=0;
        int start=0;
        for(right=0;right<arr.length;right++)
        {
            sum+=arr[right];
            while(sum>target){
                sum-=arr[left];
                left++;
            }
            if(right-left+1>maxLength)
            {
                maxLength=right-left+1;
                start=left;
            }
        }
        System.out.println(maxLength);
        for(int i=start;i<start+maxLength;i++)System.out.print(arr[i]+" ");
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int k=3;
        // System.out.println(maxSubarraySum(arr,k));
        int target=10;
        findMaxLength(arr,target);
    }
}
