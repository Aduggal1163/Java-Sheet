public class stackArray {
       public static void main(String[] args) {
          Stack s=new Stack();
          s.push(1);
          s.push(2);
          s.push(3);
          s.push(6);
          System.out.println(s.peek());
          System.out.println( s.size());
          s.display();
          s.pop();
          System.out.println( s.size());
          s.display();
    }
}
  class Stack{
    private int[]arr=new int[5];
    private int idx=0;
    void push(int x)
    {
        if(isFull())
        {
            System.out.println("Stack is full");
            return;
        }
        arr[idx]=x;
        idx++;
    }
    int peek()
    {
        if(idx==0)
        {
            System.out.println("the stack is empty");
            return -1;
        }
        return arr[idx-1]; 
    }
    int pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack is empty");
            return -1;
        }
        int top=arr[idx-1];
        arr[idx-1]=0;
        idx--;
        return top;
    }
    void display()
    {
        for(int i=0;i<=idx-1;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    int size()
    {
        return idx;
    }
    boolean isEmpty()
    {
        if(idx==0)return true;
        else
        return false;
    }
    boolean isFull()
    {
        if(arr.length==idx)
        {
            return true;
        }
        return false;
    }
}