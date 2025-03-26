import java.util.Stack;

public class Infix {
    public static void main(String[] args) {
        String str="9-(5+3)*4/6";
        Stack<Integer> val=new Stack<>();
        Stack<Character> ope=new Stack<>();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            int ascii=(int)ch;//ascii=48 means '0'
            if(ascii>=48 && ascii<=57) val.push(ascii-48);
            else if(ope.size()==0 || ch=='(' || ope.peek()=='(') ope.push(ch);
            else if(ch==')')
            {
                while(ope.peek()!='(')
                {
                    int val2=val.pop();
                    int val1=val.pop();
                    if(ope.peek()=='-') val.push(val1-val2);
                    if(ope.peek()=='+') val.push(val1+val2);
                    if(ope.peek()=='*') val.push(val1*val2);
                    if(ope.peek()=='/') val.push(val1/val2);
                    ope.pop();
                }
                ope.pop(); // ( vi htao
            }
            else{
                if(ch=='-' || ch=='+')
                {
                    int val2=val.pop();
                    int val1=val.pop();
                    if(ope.peek()=='-') val.push(val1-val2);
                    if(ope.peek()=='+') val.push(val1+val2);
                    if(ope.peek()=='*') val.push(val1*val2);
                    if(ope.peek()=='/') val.push(val1/val2);
                    ope.pop();
                    ope.push(ch); 
                }
                if(ch=='/' || ch=='*')
                {
                    if(ope.peek()=='/' || ope.peek()=='*')
                    {
                        int val2=val.pop();
                        int val1=val.pop();
                        if(ope.peek()=='*') val.push(val1*val2);
                        if(ope.peek()=='/') val.push(val1/val2);
                        ope.pop();
                        ope.push(ch);
                    }
                    else ope.push(ch);
                }
            }
        }
        while(val.size()>1)
        {
            int val2=val.pop();
            int val1=val.pop();
            if(ope.peek()=='-') val.push(val1-val2);
            if(ope.peek()=='+') val.push(val1+val2);
            if(ope.peek()=='*') val.push(val1*val2);
            if(ope.peek()=='/') val.push(val1/val2);
            ope.pop();
        }
        System.out.println(val.peek());
    }
}
