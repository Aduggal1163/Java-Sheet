package sorting_alg;

public class insertionsort {
    public static void insertion(int arr[])
    {
        int n=arr.length;
        for(int i=1;i<n;i++)
        {
            int cur=arr[i];
            int prev=i-1;
            //finding out correct position to insert
            while(prev >=0 && arr[prev]>cur){
                arr[prev+1]=arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1]=cur;
        }
    }
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        insertion(arr);
        int n=arr.length;
         for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
