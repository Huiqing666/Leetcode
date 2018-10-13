/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int numComponents(ListNode head, int[] G) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : G) {
            set.add(i);
        }
        if(set.size() == 0) return 0;
        int num = 0;
        int conn = 0;
        ListNode prev = head;
        while(head != null) {
            if(set.contains(head.val)) {
                conn++;
                //set.remove(head.val);
            }else{
                if(conn > 0) num++;
                conn = 0;
            }
            prev = head;
            head = head.next;
        }
        if(set.contains(prev.val)) num++;
        return num;
        
    }
}
