package Queue;
import java.util.*;
public class reverse {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        // System.out.print(q+" ");
        Stack<Integer> st=new Stack<>();
        while(!q.isEmpty())
        {
            st.push(q.remove());
        }
        // System.out.print(st+" ");
        while(st.size()!=0)
        {
            q.add(st.pop());
        }
        System.out.println(q+" ");
    }
}
