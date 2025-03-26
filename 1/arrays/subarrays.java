package arrays;
import java.util.*;
public class subarrays {
    public static void subarray(int arr[])
    {
        int total=0;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                     sum=sum+arr[k];
                }
                max=Math.max(max,sum);
                min=Math.min(min,sum);
                total++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Subarrays: "+total);
        System.out.println("MAX SUM OF SUBARRAY: "+ max);
        System.out.println("MIN SUM IS: "+min);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER SIZEE: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        subarray(arr);
    }
}
