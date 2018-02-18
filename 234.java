/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null)return true;
        int len = 1;
        ListNode temp = head;
        ListNode prev =  null, now = head;
        while(temp.next != null){
            //System.out.print(len);
            len++;
            temp = temp.next;
        }
        //reverse the first half
        for(int i = 0; i <(len)/2; i++ ){
            ListNode next = now.next;
            now.next = prev;
            prev = now;
            now = next;         
        }
        //compare
        if(len % 2 == 0 ){
            System.out.print(prev.val);
            System.out.print(now.val);
            if(prev.val != now.val) return false;
            else prev = prev.next;
        }
        while(prev != null){
            if(prev.val == now.next.val){
                prev = prev.next;
                now = now.next;
            }else return false; 
        }
        
        return true;
    }
}
