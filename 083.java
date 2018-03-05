/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode h = head;
        if(head == null)return head;
        ListNode temp = null;
        while( h.next != null){
            temp = h.next;
            if(temp.val != h.val){
                h = temp;
            }else{
                if(temp.next == null){
                    h.next = null;
                    return head;
                }
                else{
                    h.next = temp.next;
                }
            }
        }
        
        return head;
    }
}
