import java.lang.classfile.components.ClassPrinter.ListNode;

public class MergeList {
    // lc 21
    public static void main(String[] args) {
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy=new ListNode(-1);
        ListNode t=dummy;
        ListNode t1=list1;
        ListNode t2=list2;
        while(t1!=null && t2!=null)
        {
            if(t1.val<=t2.val)
            {
                t.next=t1;
                t1=t1.next;
            }
            else
            {
                t.next=t2;
                t2=t2.next;
            }
            t=t.next;
        }
        if(t1==null && t2!=null)t.next=t2;
        else t.next=t1;
        return dummy.next;
    }
    }
}
