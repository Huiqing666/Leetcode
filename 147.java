/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode insertionSortList(ListNode head) {
        if (head == null) return null;
        ListNode dummy = new ListNode(0);
        ListNode pre = dummy;
        ListNode curr = head;
        ListNode next = null;
        while (curr != null) {
            next = curr.next;
            System.out.println(curr.val);
            while (pre.next != null && pre.next.val < curr.val) {
                pre = pre.next;
            }
            // insert between pre && pre.next;
            curr.next = pre.next;
            pre.next = curr;
            curr = null;
            pre = dummy;
            curr = next;
            
        }
        // System.out.println(pre.next.val);
        return pre.next;
    }
}
