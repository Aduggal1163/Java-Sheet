import java.lang.classfile.components.ClassPrinter.ListNode;
import java.util.ArrayList;

public class Palindrome {
    public static void main(String[] args) {
        // 234
        class Solution {
    public static boolean isPalindrome(ArrayList<Integer>list)
    {
        int i=0;
        int j=list.size()-1;
        while(i<=j)
        {
            if(list.get(i)!=list.get(j)) return false;
            else{
          i++;
        j--;
            }
          
        }

        return true;
    }
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null) return true;
        ArrayList<Integer> list=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null)
        {
            list.add(temp.val);
            temp=temp.next;
        }
        if(isPalindrome(list)) return true;
        else 
        return false;
    }
}
    }
}
