/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode start1 = head, start2 = dummy;
        for (int i = 0; i < n; i++) {
           start1 = start1.next; 
        }
        while(start1 != null){
            start1 = start1.next;
            start2 = start2.next;
        }
        start2.next = start2.next.next;
        return dummy.next;
        
    }
}
