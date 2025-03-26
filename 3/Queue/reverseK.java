package Queue;
import java.util.*;
public class reverseK {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        int k=3;
        Stack<Integer> st=new Stack<>();
        Queue<Integer> q2=new LinkedList<>();
        while(q.size()>k)
        {
            st.push(q.remove());
        }
        while(st.size()!=0)
        {
            q2.add(st.pop());
        }
        while(q.size()!=0)
        {
            q2.add(q.remove());
        }
        System.out.print(q2+" ");
    }
}
