package arrays;
import java.util.*;
import java.util.*;
public class binarySearch {
    public static int BS(int arr[],int key){
        int start=0;
        int end=arr.length-1;
        int mid=start+(end-start)/2;
        while(start<=end){
            if(arr[mid]==key) return mid;
            else if(arr[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
            mid=start+(end-start)/2;
        }
        return -1;
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER SIZE: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("ENTER KEY: ");
        int key=sc.nextInt();
        int sol=BS(arr,key);
        System.out.println("INDEX IS : "+ sol);
    }
}
