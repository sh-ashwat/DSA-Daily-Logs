class Solution {
    public ListNode mergeKLists(ListNode[] lists) {

        PriorityQueue<ListNode> minHeap = new PriorityQueue<>((a, b) -> a.val - b.val);

        for (ListNode list : lists) {
            if (list != null) {
                minHeap.offer(list);
            }
        }

        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while (!minHeap.isEmpty()) {

            ListNode curr = minHeap.poll();
            tail.next = curr;
            tail = tail.next;

            if (curr.next != null) {
                minHeap.offer(curr.next);
            }
        }

        return dummy.next;
    }
}
