class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummyNode = new ListNode (-1);

         dummyNode.next = head;
         ListNode prev = dummyNode ;

         while ( head != null){
            if( head.next != null && head.val == head.next.val ){
                while (head.next != null && head.val == head.next.val ){
                    head = head.next;
                }
                prev.next = head.next;
            }  else {
                prev = prev.next;
            }
            head = head.next;
         }
         return dummyNode.next;
        
    }
}
