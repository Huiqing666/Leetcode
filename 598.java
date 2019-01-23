class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        int[] re = new int[]{m, n};
        for (int[] op : ops) {
            re[0] = Math.min(re[0], op[0]);
            re[1] = Math.min(re[1], op[1]);
        }
        return re[0] * re[1];
    }
}
