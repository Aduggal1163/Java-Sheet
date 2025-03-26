import java.util.Stack;
class basics{
    public static void main(String[] args) {
        Stack<Integer>s=new Stack<>();
        // s.push(6);
        // s.push(5);
        // s.push(10);
        // System.out.println(s);
        // s.pop();
        // System.out.println(s);
        // System.out.println(s.peek()); 
        // System.out.println(s.size());
        // s.pop();
        // s.pop();
        // System.out.println(s.size());
        System.out.println(s.isEmpty());
        s.push(6);
        s.push(5);
        s.push(10);
        System.out.println(s);
        ///to get first element in stack
        while(s.size()>1)
        {
            s.pop();
        }
        System.out.println(s);
    }
}