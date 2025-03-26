import java.util.Stack;
public class reverse {
    public static void main(String[] args) {
        Stack<Integer>st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        // for(int i=st.size()-1;i>=0;i--)
        // {
        //     System.out.print(st.get(i)+" ");
        // }
        Stack<Integer>reversed=new Stack<>();
        while(!st.isEmpty())
        {
            reversed.push(st.pop());
        }
        System.out.println(reversed);
    }
}
