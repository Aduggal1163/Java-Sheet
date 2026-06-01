package st1;
import java.util.*;
public class Q1 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int freq[]=new int[10];
        int m=freq.length;
        for(int i=0;i<n;i++)
        {
             if(arr[i]>=0 && arr[i]<=9)
            {
                freq[arr[i]]++;
            }
        }
        for(int i=0;i<m;i++)
        {
            System.out.print(freq[i]+" ");
        }
    }
}
