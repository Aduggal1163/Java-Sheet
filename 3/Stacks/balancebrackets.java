import java.util.*;
class balancebrackets{
    public static boolean isBalance(String s)
    {
        int n=s.length();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='(') st.push(ch);
            else{
                if(st.isEmpty()) return false;
                if(st.peek()=='(') st.pop();
            }
        }
        if(st.size()!=0) return false;
        return true;
    }
    public static void main(String[] args) {
        String s = "((()))";
        System.out.println(isBalance(s));
    }
}