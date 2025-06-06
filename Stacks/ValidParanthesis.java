import java.util.Stack;

public class ValidParanthesis {
    public static boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch=='[' || ch=='(' || ch=='{') st.push(ch);
            else
            {
                if(st.isEmpty()) return false;
                if((st.peek()=='(' && ch==')') || (st.peek()=='[' && ch == ']') || (st.peek()=='{' && ch=='}')) st.pop();
                else return false;
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        String s="([{}])";
        if(isValid(s)) System.out.println(true);
        else  System.out.println(false);
    }
}
