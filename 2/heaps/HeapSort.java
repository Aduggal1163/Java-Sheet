package heaps;

public class HeapSort {
    public static void heapify(int[] arr, int n, int i) 
        {
            int left=2*i+1;
            int right=2*i+2;
            int largest=i;
            if(left < n && arr[left]>arr[larget])
            {
                largest=left;
            }
            if(right < n && arr[right]>arr[largest])
            {
                largest=right;
            }
            if(largest!=i)
            {
                int temp=arr[i];
                arr[i]=arr[largest];
                arr[largest]=temp;
                heapify(arr, n, largest);
            }
        }
    public static void sort(int arr[], int n){
        for(int i=n/2-1;i>=0;i--)
        {
            heapify(arr,n,i);
        }
        for(int i=n-1;i>=0;i--)
        {
            int temp=arr[i];
            arr[i]=arr[0];
            arr[0]=temp;
            heapify(arr,i,0);
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,6,5,4};
    int n = arr.length;
    HeapSort hs=new HeapSort();
    hs.sort(arr,n);
    }
}
