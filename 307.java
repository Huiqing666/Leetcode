class NumArray {
    
    class TreeNode {
        int start, end;
        TreeNode left;
        TreeNode right;
        int sum;
        public TreeNode(int start, int end) {
            this.start = start;
            this.end = end;
            this.left = null;
            this.right = null;
            this.sum = 0;
        }
    }
    TreeNode root;
    public NumArray(int[] nums) {
        root = helper(nums, 0, nums.length - 1);
        
    }
    private TreeNode helper(int[] nums, int start, int end) {
        if (start > end) return null;
        TreeNode root = new TreeNode(start, end);
        if (start == end) {
            root.sum = nums[start];
            return root;
        }
        int mid = start + (end - start) / 2;
        TreeNode left = helper(nums, start, mid);
        root.left = left;
        TreeNode right = helper(nums, mid + 1, end);
        root.right = right;
        root.sum = left.sum + right.sum;
        return root;
    }
    
    public void update(int i, int val) {
        update(root, i, val);
    }
    private void update(TreeNode root, int pos, int val) {
        //leaf
        if (root.start == root.end) {
            root.sum = val;
            return;
        }
        int mid = root.start + (root.end - root.start) / 2;
        if (pos <= mid) {
             update(root.left, pos, val);
        } else {
             update(root.right, pos, val);
        }
        root.sum = root.left.sum + root.right.sum;
        
    }
    
    public int sumRange(int i, int j) {
        return sumRange(root, i, j);
    }
    private int sumRange(TreeNode root, int start, int end) {
        if (root.start == start && root.end == end) {
            return root.sum;
        }
        int mid = root.start + (root.end - root.start) / 2;
        if (end <= mid) {
            return sumRange(root.left, start, end);
        } else if (start >= mid+1) {
            return sumRange(root.right, start, end);
        }  else {    
            return sumRange(root.right, mid+1, end) + sumRange(root.left, start, mid);
        }    
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(i,val);
 * int param_2 = obj.sumRange(i,j);
 */
