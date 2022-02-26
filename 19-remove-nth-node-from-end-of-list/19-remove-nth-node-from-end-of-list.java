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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null)
        {
            ListNode temp = null;
            return temp;
        }
        ListNode dummy = head;
        int len = 0;
        while(dummy != null)
        {
            len++;
            dummy = dummy.next;
        }
        if(len == n)
        {
            head = head.next;
            return head;
        }
        int counter = 1;
        ListNode prev = head;
        ListNode curr = head.next;
        while(curr != null)
        {
            if(counter == len-n)
            {
                prev.next = curr.next;
                break;
            }
            counter++;
            prev = curr;
            curr = curr.next;
        }
        return head;
    }
}