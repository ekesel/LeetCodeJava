/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null)
            return null;
        ListNode slow = head;
        ListNode fast = head;
        while(slow!=null && fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                slow = head;
                if (slow!=fast) {
                    while(slow.next!=fast.next) {
                        slow = slow.next;
                        fast = fast.next;
                    }
                    return fast.next;
                } else {
                    while(fast.next!=slow) {
                        fast = fast.next;
                    }
                    return fast.next;
                }
            }
        }
        return null;
    }
}