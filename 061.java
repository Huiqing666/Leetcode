/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) return null;
        int n = 1;
        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
            n++;
        }
        // System.out.println(n);
        k = k % n;
        k = n - k;
        ListNode start = head;
        while (k > 0) {
            k--;
            tail.next = start;
            tail = tail.next;
            start = start.next;
        }
        tail.next = null;
        return start;
        
    }
}
