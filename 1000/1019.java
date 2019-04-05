/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int[] nextLargerNodes(ListNode head) {
        Stack<Integer> stk = new Stack<>();

        ArrayList<Integer> A = new ArrayList<>();
        for (ListNode node = head; node != null; node = node.next)
            A.add(node.val);
        
        int[] res = new int[A.size()];
        
        for (int i = 0; i < res.length; i++) {
            
            
            while (!stk.isEmpty() && A.get(stk.peek()) < A.get(i)) {
                //System.out.println(A.get(i));
                res[stk.pop()] = A.get(i);
            }
            stk.push(i);
            
        }

        

        return res;
    }
}
