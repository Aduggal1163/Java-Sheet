import java.util.*;
class Implementation{
    //using Arraylist
    static class Stack{
        static ArrayList<Integer> list= new ArrayList<>();
        public static boolean isEmpty(){
            return list.size()==0;
        } 
        public static void push( int data )
        {
            list.add(data);
        }
        public static int pop()
        {
            if(isEmpty()) return -1;
            int data=list.get(list.size()-1);
            list.remove(list.size()-1);
            return data;
        }
        public static int peek()
        {
            if(isEmpty()) return -1;
            return list.get(list.size()-1);
        }
    }
    public static void main(String args[])
    {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        while(!s.isEmpty())
        {
            System.out.print("Element is : "+s.peek());
            s.pop();
            System.out.println();
        }
    }
}