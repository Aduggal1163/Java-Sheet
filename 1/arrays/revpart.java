package arrays;

public class revpart {
    public static void rev(int arr[],int s,int e)
    {
        while(s<e){
            int temp=arr[e];
            arr[e]=arr[s];
            arr[s]=temp;
            s++;
            e--;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int k=3;
        rev(arr,0,k-1);
        rev(arr,k,arr.length-1);
        rev(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
