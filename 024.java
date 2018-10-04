/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = dummy;
        while(curr.next != null && curr.next.next != null) {
            ListNode temp = curr.next;
            ListNode tail = curr.next.next.next;
            curr.next = curr.next.next;
            curr.next.next = temp;
            curr = curr.next.next;
            curr.next = tail;       
        }
        return dummy.next;
        
    }
}
