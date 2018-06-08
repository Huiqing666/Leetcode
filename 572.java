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
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if(s == null && t == null) return true;
        if(s == null || t == null) return false;
        int sl = -1, sr = -1, tl = -1, tr = -1;
        if(s.val == t.val){
            if(s.left != null) sl = s.left.val;
            if(s.right != null) sr = s.right.val;
            if(t.left != null) tl = t.left.val;
            if(t.right != null) tr = t.right.val;
            if(sl == tl && sr == tr && isSubtree(s.left, t.left) && isSubtree(s.right, t.right)) return true;
            
        }
        return isSubtree(s.left, t)||isSubtree(s.right, t);
    }
}
