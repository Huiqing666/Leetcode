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
    int max = 0;
    Integer prev = null;
    int count = 1;
    public int[] findMode(TreeNode root) {
        
        List<Integer> list = new ArrayList<>();
        
        inOrder(root, list);
        
        int[] res = new int[list.size()];
        if (root == null) return res;
        // if (list.size() == 0) return new int[]{root.val};
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        
        return res;
        
    }
    private void inOrder(TreeNode root, List<Integer> list) {
        if (root == null) return;
        inOrder(root.left, list);
        
        if (prev != null) {
            if (root.val == prev)
                count++;
            else
                count = 1;
        }
        if (count > max) {
            max = count;
            list.clear();
            list.add(root.val);
        } else if (count == max) {
            list.add(root.val);
        }
        
        prev = root.val;
        
        
        inOrder(root.right, list);
        
    }
}
