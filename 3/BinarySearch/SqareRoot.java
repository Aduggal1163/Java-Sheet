package BinarySearch;
// 4->2 10->3

public class SqareRoot {
    public static int BS(int x)
{
    int s=0;
    int e=x;
    int ans=-1;
    while(s<=e)
    {
        int mid=s+(e-s)/2;
        if(mid*mid==x) return mid;
        else if(mid*mid<x)
        {
            ans=mid;
            s=mid+1;
        }
        else
        {
            e=mid-1;
        }
    }
    return ans;
}
    public static void main(String[] args) {
        int x=6;
        System.out.println(BS(x));
    }
}
