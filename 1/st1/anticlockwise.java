package st1;
import java.util.*;
public class anticlockwise {
    public static void main(String[] args) {
        int n=3;
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
       for(int i=0;i<n;i++)
       {
        for(int j=0;j<n;j++)
        {
            if(i<j)
            {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
       }
       
       for(int i=0;i<n;i++)
       {
        for(int j=0;j<n/2;j++)
        {
            int temp=arr[i][j];
            arr[i][j]=arr[i][n-1-j];
            arr[i][n-1-j]=temp;
        }
       }
       for(int i=0;i<n;i++)
       {
        for(int j=0;j<n;j++)
        {
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
       }
}
}