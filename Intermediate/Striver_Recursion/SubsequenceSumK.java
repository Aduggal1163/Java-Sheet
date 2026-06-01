import java.util.*;

class SubsequenceSumK{
    static int count=0;
    public static void print(int idx, int arr[], int sum, int target, List<Integer> list, int n)
    {
        if(idx==n)
        {
            if(sum==target)
            {
                count++;
                for(int elt : list) System.out.print(elt+" ");
                System.out.println();
            }
            return;
        }
        list.add(arr[idx]);
        // sum+=arr[idx];
        print(idx+1,arr,sum+arr[idx],target,list,n);
        // sum-=arr[idx];
        list.remove(list.size()-1);
        print(idx+1,arr,sum,target,list,n);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3};
        int n=3;
        int target=3;
        List<Integer> list=new ArrayList<>();
        print(0,arr,0,target,list,n);
        System.out.println("Size is -> "+count);
    }
}