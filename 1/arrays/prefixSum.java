//max subarray sum ka dusra treka more optimal then brute force
package arrays;

public class prefixSum {
    public static void sol(int arr[])
    {
            int n=arr.length;
            int maxSum=Integer.MIN_VALUE;
            int curSum=0;
            int prefix[]=new int[n];
            //calculate prefix array
            prefix[0]=arr[0];
            for(int i=1;i<prefix.length;i++)
            {
                prefix[i]=prefix[i-1]+arr[i];
            }
            for(int i=0;i<n;i++)
            {
                for(int j=i;j<n;j++)
                {
                    curSum= i==0 ? prefix[j] : prefix[j]-prefix[i-1];
                    if(maxSum<curSum)
                    maxSum=curSum;
                }
            }
            System.out.println(maxSum);
    }
    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};
        sol(arr);
    }
}