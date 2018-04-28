/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head == null) return null;
        //if(m == n)return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode prev = dummy;
        for(int i = 1; i < m; i++){
            prev = prev.next;
        }
        ListNode start = prev.next;
        ListNode then = start.next;
        while(n > m){
            n--;
            start.next = then.next;
            then.next = prev.next;
            prev.next = then;
            then = start.next;
            
        }
        return dummy.next;

    }
}
