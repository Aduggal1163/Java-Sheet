public class CycleDetection {
    public static void main(String[] args) {
        // lc 141
        public boolean hasCycle(ListNode head) {
            ListNode slow=head;
            ListNode fast=head;
            while(fast!=null && fast.next!=null)
            {
                slow=slow.next;
                fast=fast.next.next;
                if(slow==fast) return true;
            }
            return false;
        }
        // lc 142
        public class Solution {
            public ListNode detectCycle(ListNode head) {
                ListNode slow=head;
                ListNode fast=head;
                if(head==null || head.next==null) return null;
                while(fast!=null && fast.next!=null)
                {
                    slow=slow.next;
                    fast=fast.next.next;
                    if(slow==fast)
                    {
                        break;
                    }
                }
                if(slow!=fast) return null;
                else
                {
                        ListNode temp=head;
                        while(temp!=slow)
                        {
                        temp=temp.next;
                        slow=slow.next;
                        }
                }
                return slow;
            }
        }
    }
}
