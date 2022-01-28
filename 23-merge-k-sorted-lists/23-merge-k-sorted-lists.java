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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((ListNode a, ListNode b) -> {
            return a.val - b.val;
        });
        for (ListNode l: lists)
            if (l != null)
                pq.add(l);
        if (pq.size() == 0) return null;
        ListNode head = new ListNode(0);
        ListNode curr = head;
        while (!pq.isEmpty()) {
            ListNode temp = pq.poll();
            curr.next = temp;
            curr = curr.next;
            if (temp.next != null)
                pq.add(temp.next);
        }
        return head.next;
    }
}