/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode[] splitListToParts(ListNode root, int k) {
        ListNode[] res = new ListNode[k];
        if(root == null) return res;
        int n = 1;
        ListNode head = root;
        while(head.next != null) {
            head = head.next;
            n++;
        }
        int len = n / k;
        //System.out.println(len);
        int one = n % k;
        ListNode temp = root;
        for(int i = 0; i < one; i++) {
            res[i] = root;
            if(root == null) break;
            for(int j = 0; j < len; j++) {
                root = root.next;
            }
            temp = root.next;
            root.next = null;
            root = temp;
        }
        for(int i = one; i < k; i++) {
            res[i] = root;
            if(root == null) break;
            for(int j = 1; j < len; j++) {
                root = root.next;
            }
            temp = root.next;
            root.next = null;
            root = temp;
        }
        return res;
    }
}
