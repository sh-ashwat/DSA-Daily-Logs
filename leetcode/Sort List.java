/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        if( head == null){
            return null;
        }
        List<Integer> values = new ArrayList<>();

        ListNode temp  = head ;

        while ( temp != null) {
            values.add(temp.val);
            temp = temp.next;
        }
        Collections.sort(values);

        ListNode dummy = new ListNode(0);
        ListNode current = dummy ;

        for( int val : values){
            current.next  = new ListNode(val);
            current = current.next;

        }
        return dummy.next;
    }
}
