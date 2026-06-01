/* isEmpty(), isFull(), push(int) and int pop() functions available on Stack. */
static int evalPostfix(CQStack s, String exp) {
  // Write your code here
    Stack<Integer> st=new Stack<>();
    for(char ch : exp.toCharArray())
    {
        if(Character.isDigit(ch))
        {
            st.push(ch-'0');
        }
        else
        {
            int val2=st.pop();
            int val1=st.pop();
            int result=0;
            switch(ch)
            {
                case '+': result=val1+val2;break;
                case '-': result=val1-val2;break;
                case '*': result=val1*val2;break;
                case '/': result=val1/val2;break;
                case '^':result=(int)Math.pow(val1,val2);break;
            }
            st.push(result);
        }
    }
          return st.pop();
}