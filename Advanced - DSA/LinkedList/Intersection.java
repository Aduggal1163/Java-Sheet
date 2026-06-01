import java.lang.classfile.components.ClassPrinter.ListNode;

public class Intersection {
    public static void main(String[] args) {
        //lc 160
         public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA=headA;
        int lenA=0;
        while(tempA!=null)
        {
            tempA=tempA.next;
            lenA++;
        }  
        ListNode tempB=headB; 
        int lenB=0;
        while(tempB!=null)
        {
            tempB=tempB.next;
            lenB++;
        }   
        tempA=headA;
        tempB=headB;
        if(lenA>lenB)
        {
            for(int i=1;i<=lenA-lenB;i++)
            {
                tempA=tempA.next;
            }
        } 
        else
        {
          for(int i=1;i<=lenB-lenA;i++)
            {
                tempB=tempB.next;
            }  
        }   
        while(tempA!=tempB)
        {
            tempA=tempA.next;
            tempB=tempB.next;
        }
        return tempA;
    }
    }
}
