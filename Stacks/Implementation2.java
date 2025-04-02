import java.util.Stack;

public class Implementation2 {
    // using Linked List
    static class Node {
        int val;
        Node next;
        Node(int val)
        {
            this.val=val;
            this.next=null;
        }
    }
    static class Stack{
        static Node head =null;
        static boolean isEmpty(){
            return head==null;
        }
        static void push(int data)
        {
            Node nwnode=new Node(data);
            if(isEmpty())
            {
             head=nwnode; 
             return;  
            }
            nwnode.next=head;
            head=nwnode;
        }
        static int pop()
        {
            if(isEmpty()) return -1;
            int data = head.val;
            head=head.next;
            return data;
        }
        static int peek()
        {
            if(isEmpty()) return -1;
            return head.val;
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
