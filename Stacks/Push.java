import java.util.Stack;

public class Push {
    // at bottom
    public static void pushAtBottom(Stack<Integer> s, int data)
    {
        if(s.isEmpty())
        {
            s.push(data);
            return;
        }
        int top=s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> s=new Stack();
        s.push(1);
        s.push(2);
        pushAtBottom(s,6);
        while(!s.isEmpty())
        {
            System.out.println(s.pop()+" ");
        }
    }
}
