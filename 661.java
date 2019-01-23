class Solution {
    public int[][] imageSmoother(int[][] M) {
        int[][] res = new int[M.length][M[0].length];
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[0].length; j++) {
                int sum = M[i][j];
                int total = 1;
                if (i > 0) {sum += M[i - 1][j]; total++;}
                if (j > 0) {sum += M[i][j - 1]; total++;}
                if (i > 0 && j > 0) {sum += M[i - 1][j - 1];total++;}
                if (i > 0 && j < M[0].length - 1) {sum += M[i - 1][j + 1];total++;}
                if (j < M[0].length - 1) {sum += M[i][j + 1];total++;}
                if (i < M.length - 1 && j > 0) {sum += M[i + 1][j -1];total++;}
                if (i < M.length - 1) {sum += M[i + 1][j];total++;}
                if (i < M.length - 1 && j < M[0].length - 1) {sum += M[i + 1][j + 1];total++;}
                res[i][j] = (int) sum / total;
            }
        }
        return res;
    }
}
