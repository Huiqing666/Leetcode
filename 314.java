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
    public List<List<Integer>> verticalOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        TreeMap<Integer, List<Integer>> map = new TreeMap<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        List<Integer> r = new ArrayList<>();
        r.add(root.val);
        map.put(0, r);
        HashMap<TreeNode, Integer> keymap = new HashMap<>();
        keymap.put(root, 0);
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode curr = q.peek();
                int col = keymap.get(q.poll());
                if (curr.left != null) {
                    List<Integer> list = map.getOrDefault(col - 1, new ArrayList<>());
                    list.add(curr.left.val);
                    map.put(col - 1, list);
                    keymap.put(curr.left, col - 1);
                    q.offer(curr.left);
                }
                if (curr.right != null) {
                    List<Integer> list = map.getOrDefault(col + 1, new ArrayList<>());
                    list.add(curr.right.val);
                    map.put(col + 1, list);
                    keymap.put(curr.right, col + 1);
                    q.offer(curr.right);
                }
            }
        }
        for (int i : map.keySet()) {
            // Collections.sort(map.get(i));
            res.add(map.get(i));
        }
        return res;
    }
}
