import java.lang.classfile.components.ClassPrinter.ListNode;
import java.util.ArrayList;
import java.util.Collections;

class SortList{
    public static void main(String[] args) {
        // 148
        class Solution {
    public ListNode sortList(ListNode head) {
            if (head == null || head.next == null) {
            return head;
        }
        ArrayList<Integer> list = new ArrayList<>();
        ListNode current = head;
        while (current != null) {
            list.add(current.val);
            current = current.next;
        }
        Collections.sort(list);
        ListNode dummy = new ListNode(0);
        ListNode sortedCurrent = dummy;
        for (int val : list) {
            sortedCurrent.next = new ListNode(val);
            sortedCurrent = sortedCurrent.next;
        }

        return dummy.next;
    }
}
}
}