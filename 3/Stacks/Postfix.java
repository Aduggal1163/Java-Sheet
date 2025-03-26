import java.util.Stack;

public class Postfix {
    public static void main(String[] args) {
        String str="9-(5+3)*4/6";
        Stack<String> val=new Stack<>();
        Stack<Character> ope=new Stack<>();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            int ascii=(int)ch;//ascii=48 means '0'
            if(ascii>=48 && ascii<=57)
            {
                String s=""+ch;
                val.push(s);
            }
            else if(ope.size()==0 || ch=='(' || ope.peek()=='(') ope.push(ch);
            else if(ch==')')
            {
                while(ope.peek()!='(')
                {
                    String val2=val.pop();
                    String val1=val.pop();
                    char o=ope.pop();
                    String t=val1+val2+o;
                    val.push(t);
                }
                ope.pop(); // ( vi htao
            }
            else{
                if(ch=='-' || ch=='+')
                {
                    String val2=val.pop();
                    String val1=val.pop();
                    char o=ope.pop();
                    String t=val1+val2+o;
                    val.push(t);
                    ope.push(ch); 
                }
                if(ch=='/' || ch=='*')
                {
                    if(ope.peek()=='/' || ope.peek()=='*')
                    { 
                        String val2=val.pop();
                        String val1=val.pop();
                        char o=ope.pop();
                        String t=val1+val2+o;
                        val.push(t);
                        ope.push(ch);
                    }
                    else ope.push(ch);
                }
            }
        }
        while(val.size()>1)
        {
                    String val2=val.pop();
                    String val1=val.pop();
                    char o=ope.pop();
                    String t=val1+val2+o;
                    val.push(t);
        }
        System.out.println(val.pop());
    }
}
