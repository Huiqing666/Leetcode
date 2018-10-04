/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = dummy;
        while(curr != null) {
            ListNode start = curr;
            ListNode re = new ListNode(0);
            ListNode dummy2 = re;
            for(int i = 0; i < k; i++) {
                if(curr.next == null) return dummy.next;
                curr = curr.next;
                re.next = new ListNode(curr.val);
                re = re.next;
                //System.out.println(re.val);
            }
            ListNode tail = curr.next;
            start.next = reverse(dummy2);
            for(int i = 0; i < k; i++) {
                start = start.next;
                //System.out.println(start.val);
            }
            start.next = tail;
            curr = start;
            //System.out.println(curr.val);
        }
        return dummy.next;
        
    }
    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        while(head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
            //System.out.println("prev" + prev.val);
        }
        
        return prev;
    }
}
