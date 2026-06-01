package BinarySearch;

public class FirstOccurance {
    public static void BS(int[] arr, int x)
    {
        int s=0;
        int e=arr.length-1;
        int mid=s+(e-s)/2;
        while(s<=e)
        {
            mid=s+(e-s)/2;
            if(arr[mid]==x)
            {
                System.out.println(mid);
                break;
            }
            if(arr[mid]>x) e=mid-1;
            else s=mid+1;
        }
    }
    public static void main(String[] args) {
        int arr[]={2,5,5,5,6,6,8,9,9,9};
        int x=5;
        BS(arr,x);
    }
}
