package arrays;
import java.util.*;
public class rev {
    public static void reverse(int arr[]) {
        int s=0;
        int e=arr.length-1;
        while(s<e)
        {
            int temp=arr[e];
            arr[e]=arr[s];
            arr[s]=temp;
            s++;
            e--;
        }
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
        reverse(arr);
        System.out.print("REversed Array is :");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
