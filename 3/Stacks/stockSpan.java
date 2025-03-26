import java.util.ArrayList;
import java.util.Stack;

public class stockSpan {
    public static void main(String[] args) {
        int arr[] = {100, 80, 60, 70, 60, 75, 85};
        Stack<Integer> st=new Stack<>();
        ArrayList<Integer> res=new ArrayList<>();
        st.push(0);
        for(int i=0;i<arr.length;i++)
        {
            while(!st.isEmpty() && arr[i]>=arr[st.peek()]) st.pop();
            if(st.isEmpty()) res.add(i+1);
            else res.add(i-st.peek());
            st.push(i);
        }
        for(int i=0;i<res.size();i++)
        {
            System.out.print(res.get(i)+" ");
        }
    }
}
