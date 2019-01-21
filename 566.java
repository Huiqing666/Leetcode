class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int m = nums.length;
        int n = nums[0].length;
        if (m * n != r * c) return nums;
        int[][] res = new int[r][c];
        int p = 0, q = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                res[i][j] = nums[p][q];
                if (++q >= n) {
                    p++;
                    q = 0;
                }
            }
        }
        return res;
    }
}
