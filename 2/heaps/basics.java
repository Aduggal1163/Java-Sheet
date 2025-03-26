package heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class basics {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();//min heap
        pq.add(1);
        pq.add(2);
        pq.add(10);
        System.out.println(pq);
        pq.remove();
        System.out.println(pq);
        pq.add(0);
        System.out.println(pq);
        System.out.println(pq.peek());
        PriorityQueue<Integer> pq1=new PriorityQueue<>(Collections.reverseOrder()); //max heap
        pq1.add(1);
        pq1.add(2);
        pq1.add(10);
        System.out.println(pq1);
        pq1.remove();
        System.out.println(pq1);
        pq1.add(0);
        System.out.println(pq1);
        System.out.println(pq1.peek());
    }
}
