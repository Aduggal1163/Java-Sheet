package BinarySearch;
//find min in rotated sorted array
public class Findminimum {
    // public static int findmin(int[] arr)
    // {
    //     int n=arr.length;
    //     int s=0;
    //     int e=n-1;
    //     int ans=-1;
    //     while(s<=e)
    //     {
    //         int mid=s+(e-s)/2;
    //         if(arr[mid]<arr[n-1])
    //         {
    //             ans=mid;
    //             e=mid-1;
    //         }
    //         else
    //         {
    //             s=mid+1;
    //         }
    //     }
    //     return ans;
    // }
    public static int search(int [] arr, int x)
    {
        int s=0;
        int e=arr.length-1;
        while(s<=e)
        {
            int mid=s+(e-s)/2;
            if(arr[mid]==x) return mid;
            else if(arr[mid]<arr[e])
            { // mid to e is sorted
                if(x>arr[mid] && x<arr[e])
                {
                    s=mid+1;
                }
                else{
                    e=mid-1;
                }
            }
            else
            {
                if(x>arr[s] && x<arr[mid])
                {
                    e=mid-1;
                }
                else
                {
                    s=mid+1;
                }
            }
        }
        return -1;
    }
    //     public static int searchinduplicacy(int [] arr2, int x)
    //     {
    //         int s=0;
    //         int e=arr2.length-1;
    //         while(s<=e)
    //         {
    //             int mid=s+(e-s)/2;
    //             if(arr2[mid]==x) return mid;
    //             else if(arr2[s]==arr2[mid] && arr2[end]==mid)
    //             {
    //                 s++;
    //                 e--;
    //             }
    //             else if(arr2[mid]<=arr2[arr2.length-1])
    //             {
    //                 if(x>arr2[mid] && x<=arr2[e])
    //                 {
    //                     s=mid+1;
    //                 }
    //                 else
    //                 {
    //                     e=mid-1;
    //                 }
    //             }
    //             else
    //             {
    //                 if(x>=arr2[s] && x<arr2[mid])
    //                 {
    //                     e=mid-1;
    //                 }
    //                 else
    //                 {
    //                     s=mid+1;
    //                 }
    //             }
    //         }
    //         return -1;    
    // }
    public static void main(String[] args) {
        int arr[]={5,6,7,8,9,10,1,2,3,4};
        // int min=findmin(arr);
        // System.out.println(min);
        //search 
        int ans=search(arr,10);
        System.out.println(ans);
        //search in duplicates
        // int arr2[]={1,1,1,1,1,1,2,3,1,1};
        // System.out.println(searchinduplicacy(arr2,2));
    }
}
