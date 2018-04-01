/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int nn = 0;
        ListNode start = head, start2 = head;
        while(start.next != null){
            nn++;
            start = start.next;
        }
        
        nn = nn - n + 1;
        //System.out.println(nn);
        if(nn == 0){
            head = head.next;
            return head;
        }
        while(nn != 1){
            start2 = start2.next;
            nn--;
        }
        if(start2.next == null) start2 = null;
        else start2.next = start2.next.next;
        return head;
    }
}
