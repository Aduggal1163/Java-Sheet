package arrays;
import java.util.*;
public class pairs {
    public static void pair(int arr[]) {
        for(int i=0;i<arr.length;i++)
        {
            int curr=arr[i];
            for(int j=i+1;j<arr.length;j++)
            {
                System.out.println("("+curr+","+arr[j]+")");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER SIZEE: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        pair(arr);
    }    
}
