public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode t1 = headA;
        int count1 = 0;

        while (t1 != null) {
            count1++;
            t1 = t1.next;
        }

        ListNode t2 = headB;
        int count2 = 0;
        while (t2 != null) {
            count2++;
            t2 = t2.next;
        }
        // Reset pointers to heads
        t1 = headA;
        t2 = headB;

       
        int diff = Math.abs(count1 - count2);
        if (count1 > count2) {
            while (diff > 0) {
                diff --;
                t1 = t1.next;
            }
        } else {
            while (diff > 0) {
                diff --;
                t2 = t2.next;
            }
        }

        while (t1 != null && t2 != null) {
            if (t1 == t2) {
                return t1; 
            }
            t1 = t1.next;
            t2 = t2.next;
        }

        return null; 
    }
}
