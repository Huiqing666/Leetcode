/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        if(head == null || head.next == null || head.next.next == null)return;
        ListNode now, prev = null;
        ListNode fast = head, slow = head;
        int i = 0;
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
            i++;
        }
        //reverse the second half   
        now = reverse(slow.next);
        
        slow.next = null;////
        
        ListNode first = head, temp;
        //System.out.println(slow.val);
        while(now != null){
            temp = now.next;
            //System.out.println(now.val);
            now.next = first.next;
            first.next = now;
            first = now.next;
            now = temp;
        }
        return;   
    }
    private ListNode reverse(ListNode head){
        if(head.next == null)return head;
        ListNode next, prev = null;
        while(head != null){
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}
