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
                if(headA == null || headB == null)return null;
        ListNode N1 = headA;
        ListNode N2 = headB;
        while(N1 != N2){
            N1 = N1 == null ? headB : N1.next;
            N2 = N2 == null ? headA : N2.next;
        }
        return N1;
    }
}
