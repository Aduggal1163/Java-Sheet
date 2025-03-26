// lc 2
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        int carry=0;
        while(l1!=null && l2!=null)
        {
            int num=l1.val+l2.val+carry;
            ListNode t=new ListNode(num%10);
            temp.next=t;
            temp=temp.next;
            if(num>9)
            {
                carry=1;
            }
            else carry=0;
            l1=l1.next;l2=l2.next;
        }
        if(carry==1)
        {
            ListNode t=new ListNode(1);
            temp.next=t;
            t=t.next;
        }
        return dummy.next;
    }
}
 //upper code is if len is same 
 class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        int carry=0;
        while(l1!=null || l2!=null)
        {
            int val1=0;
            int val2=0;
            if(l1!=null) val1=l1.val;
            if(l2!=null) val2=l2.val;
            int num=val1+val2+carry;
            ListNode t=new ListNode(num%10);
            temp.next=t;
            temp=temp.next;
            if(num>9)
            {
                carry=1;
            }
            else carry=0;
            if(l1!=null)l1=l1.next;
            if(l2!=null)l2=l2.next;
        }
        if(carry==1)
        {
            ListNode t=new ListNode(1);
            temp.next=t;
            t=t.next;
        }
        return dummy.next;
    }
}
 //this code is even if len are diff