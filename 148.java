/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    //implement using merge sort
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode middle = findMiddle(head);
        ListNode secondHalf = middle.next;
        middle.next = null;
        return mergeTwoList(sortList(head), sortList(secondHalf));
        
    }
    private ListNode mergeTwoList(ListNode first, ListNode second) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        while(first != null && second != null) {
            if(first.val < second.val) {
                curr.next = first;
                first = first.next;
            }else{
                curr.next = second;
                second = second.next;
            }
            curr = curr.next;
        }
        curr.next = (first == null) ? second : first;
        return dummy.next;

    }
    private ListNode findMiddle(ListNode head) {
        if(head == null) return head;
        ListNode fast = head, slow = head;
        while(fast.next != null && fast.next.next != null){// 写错了
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    
}
