/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        //dummy.next = new ListNode(0);
        ListNode curr = dummy;
        int carry = 0;
        int v1 = 0, v2 = 0;
        while(l1 != null || l2 != null){
            v1 = (l1 == null) ? 0 : l1.val;
            v2 = (l2 == null) ? 0 : l2.val;
            
            curr.next = new ListNode((v1 + v2 + carry) % 10);
            curr = curr.next;
            //System.out.println(curr.val);
            carry = (v1 + v2 + carry) /10;
            
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next; 
        }
        if(carry > 0) curr.next = new ListNode(carry);
        return dummy.next;
    }
}
