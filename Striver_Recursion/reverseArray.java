public class reverseArray {
    public static void reverse(int [] arr, int i, int j)
    {
        if(i>=j)return;
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        reverse(arr,i+1,j-1);
    }
    public static void rev(int[] arr, int i)
    {
        int n=arr.length;
        if(i>n/2)return;
        int temp=arr[i];
        arr[i]=arr[n-i-1];
        arr[n-i-1]=temp;
        rev(arr, i+1);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        // reverse(arr, 0, arr.length-1);
        for(int elt : arr) System.out.print(elt+" ");
        System.out.println();
        rev(arr,0);
        for(int elt : arr) System.out.print(elt+" ");
    }
}
