package sorting_alg;

public class selectionsort {
    public static void selection(int arr[])
    {
        int n=arr.length;
        for(int turn=0;turn<n-1;turn++){
            int minpos=turn;
            for(int j=turn+1;j<n;j++)
            {
                if(arr[minpos]>arr[j]) minpos=j; //agar des order mei karna ha then arr[minpos]<arr[j]
            }
            //swap
            int temp=arr[minpos];
            arr[minpos]=arr[turn];
            arr[turn]=temp;
        }
    }
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        selection(arr);
        int n=arr.length;
         for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
