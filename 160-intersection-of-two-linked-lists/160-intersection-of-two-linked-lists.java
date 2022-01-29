/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int count1=0,count2=0;
        ListNode tempA=headA;
        ListNode tempB=headB;
        while(headA!=null)
        {   count1++;
            headA=headA.next;
        }
        while(headB!=null)
        {
            count2++;
            headB=headB.next;
        }
        if(count1>count2&&tempA!=null)
        {
            while(count1>count2)
            {tempA=tempA.next;
             count1--;
           }
        }
        else if(count1<count2)
        {
            while(count1<count2&&tempB!=null)
            {tempB=tempB.next;
             count2--;
           }
        }
        while(tempA!=null&&tempB!=null)
        {
            if(tempA==tempB)return tempA; 
            tempA=tempA.next;
             tempB=tempB.next;
        }
        return null;
    }
}