import java.util.Stack;

public class reverse {
    public static String reverse(String str)
    {
        Stack<Character> s=new Stack<>();
        int idx=0;
        while(idx < str.length())
        {
            s.push(str.charAt(idx++));
        }
        StringBuilder sb=new StringBuilder("");
        while(!s.isEmpty())
        {
            sb.append(s.pop());
        }
        return sb.toString();
    }

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
    public static void reverse(Stack<Integer> s)
    {
        if(s.isEmpty()) return;
        int top=s.pop();
        reverse(s);
        pushAtBottom(s,top);
    }
    public static void printstack(Stack<Integer> s)
    {
        while(!s.isEmpty())
        {
            System.out.print(s.pop()+" ");
        }
    }
    public static void main(String[] args) {
        String str = "Hello World";
        // System.out.println(reverse(str));
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        reverse(s);
        printstack(s);
    }
}
