import java.lang.classfile.components.ClassPrinter.ListNode;

public class Duplicates {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp=head;
        while(temp!=null && temp.next!=null)
        {
            if(temp.val==temp.next.val)
            {
                temp.next=temp.next.next;
            }
            else
            temp=temp.next;
        }        
        return head;
    }
}
