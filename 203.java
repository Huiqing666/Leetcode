/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        while(head.next != null){
            if(head.val == val){
                prev.next = head.next;
            }else{
                prev = head;
            }
            head = head.next;
            //System.out.println(head.val);
        }
        if(head.val == val) prev.next = null;
        return dummy.next;
    }
}
