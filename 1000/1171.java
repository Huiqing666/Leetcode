/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = dummy.next;
        Map<Integer, ListNode> map = new HashMap<>();
        int sum = 0;
        map.put(0, dummy);
        while (curr != null) {
            sum += curr.val;
            if (!map.containsKey(sum)) {
                map.put(sum, curr);
            }
            else {
                ListNode before = map.get(sum);
                ListNode middle = before.next;
                while (middle != curr) {
                    sum += middle.val;
                    map.remove(sum);
                    middle = middle.next;
                }
                before.next = curr.next;
                sum += curr.val;
            }
            curr = curr.next;
        }
        return dummy.next;
    }
}