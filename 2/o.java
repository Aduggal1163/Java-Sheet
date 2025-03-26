import java.util.Collections;
import java.util.PriorityQueue;
public class o {
    public static void main(String[] args) {
        int arr[]={2,3,12,4,5,3};
        int n=arr.length;
        PriorityQueue<Integer> ans=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<n;i++)
        {
            ans.add(arr[i]);
        }
        System.out.println(ans);
    }
}
