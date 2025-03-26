package sorting_alg;
import java.util.*;
public class inbuilt {
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        // Arrays.sort(arr);
        Arrays.sort(arr,0,3);
        int n=arr.length;
         for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
