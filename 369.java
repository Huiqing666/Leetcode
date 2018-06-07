/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode plusOne(ListNode head) {
        if(head == null) return head;
        head = reverse(head);
        ListNode h = head;       
        while(head!= null && head.val == 9){
            head.val = 0;
            if(head.next == null)head.next = new ListNode(0);
            head = head.next;
        }
        head.val++;
        //System.out.println("this is"+head.val);
        h = reverse(h);
        return h;
    }
    private ListNode reverse(ListNode head){
        ListNode prev = null;
        while(head != null){
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
            //System.out.println(prev.val);
        }
        return prev;
    }
            
}
