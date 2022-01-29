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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null)
            return head;
        TreeSet<Integer> hs = new TreeSet<Integer>();
        ListNode dummy = head;
        while(dummy != null)
        {
            hs.add(dummy.val);
            dummy = dummy.next;
        }
         Iterator<Integer> it = hs.iterator();
        ListNode root = new ListNode(it.next(),null);
        ListNode temp = root;
        while(it.hasNext())
        {
            ListNode tmp = new ListNode(it.next(),null);
            temp.next = tmp;
            temp = temp.next;
        }
        return root;
    }
}