import java.util.Stack;

public class copy {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        System.out.println(st);
        Stack<Integer> copy = new Stack<>();
        while(!st.isEmpty()) {
            copy.push(st.pop());
        }
        Stack<Integer>copyFinal=new Stack<>();
        while(!copy.isEmpty())
        {
            copyFinal.push(copy.pop());
        }
        System.out.println(copyFinal);
    }
}
