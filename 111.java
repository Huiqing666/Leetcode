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
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        Queue<Integer> cc = new LinkedList<Integer>();
        q.add(root);
        cc.add(1);
        while(!q.isEmpty()){
            TreeNode current = q.poll();
            int counter = cc.poll();
            if(current.left == null && current.right == null) return counter;
            if(current.left != null) {
                q.add(current.left);
                cc.add(counter+1);
            }
            if(current.right != null) {
                q.add(current.right);
                cc.add(counter+1);
            }
        }
        return 0;
        
    }
}
