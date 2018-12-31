class Solution {
    public boolean verifyPreorder(int[] preorder) {
        if (preorder.length == 0) return true;
        return helper(preorder, 0, preorder.length - 1);
        
    }
    private boolean helper(int[] preorder, int left, int right) {
        if (left >= right) return true;
        int split = right + 1;
        int flag = preorder[left];
        for (int i = left + 1; i <= right; i++) {
            if (preorder[i] > flag) {
                split = i;
                break;
            }
        }
        // System.out.println(split);
        for (int i = split; i <= right; i++) {
            if (preorder[i] < flag) return false;
        }
        return helper(preorder, left + 1, split - 1) && helper(preorder, split, right);
    }
}
