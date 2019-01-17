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
    String res = "";
    public String tree2str(TreeNode t) {
        //  postorder traversal
        if (t == null) return "";
        
        String left = tree2str(t.left);
        String right = tree2str(t.right);
        // System.out.println(t.val);
        if (left.length() == 0 && right.length() == 0) return res + t.val;
        if (left.length() == 0) return res + t.val +  "()" + "(" + right + ")";
        if (right.length() == 0) return res + t.val + "(" + left + ")";
        
        return res + t.val +  "(" + left + ")" + "(" + right + ")";
    }
}
