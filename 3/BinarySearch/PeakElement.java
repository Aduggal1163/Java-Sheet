package BinarySearch;

public class PeakElement {
    162
    class Solution {
    public int findPeakElement(int[] arr) {
        int s=0;
        int e=arr.length-1;
        while(s<=e)
        {
            int mid=s+(e-s)/2;
            if((mid==0 || arr[mid]>arr[mid-1])&&(mid==arr.length-1 || arr[mid]>arr[mid+1])) return mid;
            else if(arr[mid]>arr[mid+1]) e=mid-1;
            else s=mid+1;
        }
        return -1;
    }
}
}
