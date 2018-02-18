/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        /*
        if(head == null)return false;
        ArrayList<ListNode> nodes = new ArrayList<ListNode>();
        int i = 0;
        nodes.add(i,head);
        while(head.next != null){//check if it contains a cycle
            if(nodes.contains(head.next)){
                return true;
            }else{
                nodes.add(++i, head.next);
                head = head.next;
            }

        }       
        return false;
        */
        /*
        try{
            while(head.next != null){
                head = head.next;
            }
        }catch(Exception e){
            return true;
        }
        return false;
        */
        ListNode fast = head, slow = head;
        if(fast == null)return false;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) return true;
        }
        return false;
    }
}
