//brute force
package arrays;
import java.util.*;
public class maxSubarraySum {
    public static void sol(int arr[]){
        int n=arr.length;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                int sum=0;
                for(int k=i;k<=j;k++)
                {
                    sum=sum+arr[k];
                }
                maxSum=Math.max(maxSum,sum);
            }
        }
        System.out.println(maxSum);
    }
    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};
        sol(arr);
    }
}
