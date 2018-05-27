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
    public int closestValue(TreeNode root, double target) {
        double diff = Double.MAX_VALUE;
        Queue<TreeNode> qnode = new LinkedList<TreeNode>();
        qnode.add(root);
        int res = root.val;
        while(!qnode.isEmpty()){
            TreeNode temp = qnode.remove();
            if(diff > Math.abs(target - (double)temp.val)){
                diff = Math.abs(target - (double)temp.val);
                res = temp.val;
            }
            if(temp.left != null) qnode.add(temp.left);
            if(temp.right != null) qnode.add(temp.right);
            
        }
        return res;
    }
}
