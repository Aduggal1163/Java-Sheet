package Queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// First negative in every window of size k
public class window {
       static List<Integer> FirstNegativeInteger(int arr[], int k) {
        // write code here
        List<Integer> res=new ArrayList<>();
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<0) q.add(i);
        }
        int N=arr.length;
        for(int i=0;i<N-k+1;i++)
        {
            while(q.size()>0 && q.peek()<i) q.remove();
            if(q.size()>0 && q.peek()<=i+k-1) res.add(arr[q.peek()]);
            else res.add(0);
        }
        return res;
    }

}
