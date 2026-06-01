package heaps;

import java.util.PriorityQueue;

public class kthlargest {
    public static void main(String[] args) {
        int arr[]={10,2,8,3,-6,2,9,-12};
        int k=3;
           PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int ele:arr)
        {
            pq.add(ele);
            if(pq.size()>k)
            pq.remove();
        }
        System.out.println(pq.peek());
    }
}
