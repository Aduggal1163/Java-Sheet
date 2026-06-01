public class Implementation {
    public static boolean bs(int arr[], int target)
    {
        int s=0;
        int e=arr.length-1;
        int mid=s+(e-s)/2;
        while(s<=e)
        {
            if(arr[mid]==target) return true;
            else if(arr[mid]<target) s=mid+1;
            else e=mid-1;
            mid=s+(e-s)/2;
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int target=6;
        if(bs(arr,target))System.out.println("Yes");
        else System.out.println("No");
    }
}
