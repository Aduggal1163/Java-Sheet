class ListNode{
        public static void main(String[] args) {
        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(40);
        Node e=new Node(50);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        // System.out.println(a.val);
        // System.out.println(a.next.val);
        Node temp=a;//shallow copy
        for(int i=1;i<=5;i++)
        {
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
    }
}
public class Node{
    int val;
    Node next;
    Node(int val)
    {
        this.val=val;
        this.next=null;
    }
}