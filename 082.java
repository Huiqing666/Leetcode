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
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        while(head != null && head.next != null){
            ListNode temp = head;
            while(temp != null && temp.next != null && temp.val == temp.next.val){
                temp = temp.next;
            }
            if(temp != head){
                prev.next = temp.next;//delete nodes
            }else{
                prev = prev.next;
            }
            head = temp.next;
        }
        return dummy.next;
        
    }
}
