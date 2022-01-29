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
        ArrayList<ListNode> arr = new ArrayList<ListNode>();
        if(head == null)
            return head;
        while(head != null)
        {
            arr.add(head);
            head = head.next;
        }
        Collections.sort(arr, new Comparator<ListNode>() {
            @Override public int compare(ListNode p1, ListNode p2)
            {
                return p1.val-p2.val;
            }
        });
        ListNode root = new ListNode();
        root.val = arr.get(0).val;
        root.next = null;
        ListNode temp = root;
        for(int i=1;i<arr.size();i++)
        {
            ListNode tmp = new ListNode(arr.get(i).val, null);
            temp.next = tmp;
            temp = temp.next;
        }
        return root;
    }
}