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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        if(root1 == null && root2 == null) return true;
        if(root1 == null || root2 == null) return false;
        
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        find(root1, l1);
        find(root2, l2);
        //System.out.println(l1.size() + " " + Arrays.toString(l1.toArray()));
        //System.out.println(l2.size() + " " + Arrays.toString(l2.toArray()));
        

        if(l1.size() != l2.size()) return false;
        for(int i = 0; i < l1.size(); i++) {
            if(l1.get(i) != l2.get(i)) return false;
        }
        return true;
        
        
    }
    private void find(TreeNode root, List<Integer> l) {
        if(root == null) return;
        if(root.left == null && root.right == null) {
            l.add(root.val);
        }
        find(root.left, l);
        find(root.right, l);
    }
}
