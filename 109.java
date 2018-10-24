/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    ListNode node;
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) return null;
        int n = 1;
        node = head;
        while (head.next != null) {
            n++;
            head = head.next;
        }
        return helper(0, n - 1);
    }
    private TreeNode helper(int start, int end) {
        if(start > end) return null;
        int mid = start + (end - start) / 2;
        TreeNode left = helper(start, mid-1);
        TreeNode root = new TreeNode(node.val);
        root.left = left;
        node = node.next;
        TreeNode right = helper(mid+1, end);
        root.right = right;
        
        return root;
        
        
    }
}
