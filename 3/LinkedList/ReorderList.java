import java.lang.classfile.components.ClassPrinter.ListNode;

public class ReorderList {
    // lc 143
     public ListNode middleNode(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while( fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }   
        return slow;     
    }
    public ListNode reverseList(ListNode head) {
            ListNode curr=head;
            ListNode prev=null;
            ListNode next=head;
            while(curr!=null)
            {
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }        
            return prev;
    }
    public void reorderList(ListNode head) {
        ListNode middleNode=middleNode(head);
        ListNode head2=middleNode.next;
        middleNode.next=null;
        head2=reverseList(head2);
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        while(head!=null && head2!=null)
        {
            temp.next=head;
            head=head.next;
            temp=temp.next;
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
        }
        if(head==null) temp.next=head2;
        if(head2==null) temp.next=head;
        head=dummy.next;
    }
}
