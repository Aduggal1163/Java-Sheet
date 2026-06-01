//FIND ALL SUBARRAYS MAXSUM MINSUM OF ALL SUBARRAY AND TOTAL NO OF SUBARRAYS+
package arrays;
import java.util.*;
public class subarray {
    public static void subarray(int arr[])
    {
        int maxSum=Integer.MIN_VALUE;
        int minSum=Integer.MAX_VALUE;
        int total=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                int sum=0;
                for(int k=i;k<=j;k++)
                {
                    System.out.print(arr[k]+" ");
                    sum=sum+arr[k];
                }
                total++;
                maxSum=Math.max(maxSum,sum);
                minSum=Math.min(minSum, sum);
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Subarrays: "+total);
        System.out.println("MAX SUM IS : "+maxSum);
        System.out.println("MIN SUM : "+minSum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER SIZE: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        subarray(arr);
    }
}
