// LC 1721
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode slow=head;
        ListNode fast=head;
        for(int i=1;i<k;i++)
        {
            fast=fast.next;
        }
        ListNode first=fast;
        while(fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next;
        }
        ListNode second=slow;
        int temp=first.val;
        first.val=second.val;
        second.val=temp;
        return head;
    }
}