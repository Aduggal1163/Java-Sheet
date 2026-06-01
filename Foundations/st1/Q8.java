package st1;

import java.util.*;

public class Q8 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int k=4;
        int n=arr.length;
        Arrays.sort(arr);
        for(int i=0;i<n;i++)
        {
            if(k<=n)
            {
                System.out.println(arr[n-k]);
                break;
            }
            else{
                System.out.println("Invalid input");
                break;
            }
        }
    }
}
