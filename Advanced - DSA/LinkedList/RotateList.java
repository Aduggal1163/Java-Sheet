class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null) return head;
        ListNode slow=head;
        ListNode fast=head;
        ListNode temp=head;
        int n=0;
        while(temp!=null)
        {
            temp=temp.next;
            n++;
        }
        temp=head;
         k=k%n;
        if(k==0) return head;
        for(int i=1;i<=k;i++)
        {
            fast=fast.next;
        }
        while(fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next;
        }
        ListNode newHead=slow.next;
        slow.next=null;
        fast.next=head;
        return newHead;
    }
} //lc 61