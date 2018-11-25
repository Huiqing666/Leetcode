class Solution {
    class TrieNode {
        int val;
        TrieNode left;
        TrieNode right;
        TrieNode(int val) {
            this.val = val;
            left = null;
            right = null;
        }
    }
    public int findMaximumXOR(int[] nums) {
        if (nums.length == 0) return 0;
        TrieNode root = new TrieNode(0);
        for (int i = 0; i < nums.length; i++) {
            addNumber(nums[i], root);
        }
        int maxXor = 0;
        for (int i = 0; i < nums.length; i++) {
            maxXor = Math.max(maxXor, traverse(nums[i], root));
        }  
        return maxXor;
        
    }
    private int traverse(int num, TrieNode root) {
        
        int res = 0;
        for(int j = 31; j >= 0; j--){
            int tmp = (num >>j) & 1;
            //System.out.println(tmp);
            if(root.left != null && root.right != null){
                if(tmp == 1){
                    root = root.left;
                }else {
                    root = root.right;
                }
                
            }
            else {
                root = root.left == null ? root.right : root.left;
            }
            res += (tmp ^ root.val) << j;
 
        }
        return res;
    }
    private void addNumber(int num, TrieNode root) {
        for(int j = 31; j >= 0; j--) {
            int tmp = (num >>j) & 1;
            if (tmp == 1){
                if (root.right == null){
                    root.right = new TrieNode(1);
                }
                root = root.right;
            }
            else{
                if (root.left == null){
                    root.left = new TrieNode(0);
                }
                root = root.left;
            }
        }
    }
    
}
