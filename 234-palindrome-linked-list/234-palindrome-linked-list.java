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
    public boolean isPalindrome(ListNode head) {
        ListNode second_list = null;
        int size = 0;
        ListNode temp = head;
        while(temp != null){
            size += 1;
            temp = temp.next;
        }
        for(int i=0;i<size/2;i++){
            ListNode temp_node = head;
            head = head.next;
            temp_node.next = second_list;
            second_list = temp_node;
        }
        if(size % 2 != 0){
            head = head.next;   
        }
        while(head != null){
            if(head.val != second_list.val){
                return false;
            }
            head = head.next;
            second_list = second_list.next;
        }
        
        return true;
    }
}