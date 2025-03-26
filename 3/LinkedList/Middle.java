import java.lang.classfile.components.ClassPrinter.ListNode;

public class Middle {
 public static void main(String[] args) {
    //lc 876
    public ListNode middleNode(ListNode head) {
        ListNode temp=head;
        int len=0;
        while(temp!=null)
        {
            temp=temp.next;
            len++;
        }    
        temp=head;
        int mid=len/2+1;
        for(int i=1;i<mid;i++)
        {
            temp=temp.next;
        }
        return temp;
    }
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
 }   
}
