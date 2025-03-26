public class arrayTraversal {
    public static void solve(int index, int arr[])
    {
        if(index==arr.length)
        {
            return;
        }
        System.out.print(arr[index]+" ");
        solve(index+1,arr);
    }
    public static void main(String[] args) {
        int n=5;
        int arr[]={1,2,3,4,5};
        solve(0, arr);
    }
}
