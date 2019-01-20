class Solution {
    public int[] sortedSquares(int[] A) {
        int m = 0;
        while (m < A.length - 1 && Math.abs(A[m]) >= Math.abs(A[m+1])) {
            m++;
        }
        int l = m - 1, r = m + 1;
        int[] res = new int[A.length];
        res[0] = A[m] * A[m];
        int i = 1;
        while (l >= 0 || r < A.length) {
            
            if (r == A.length) m = l--;
            else if (l < 0) m = r++;
            else {
                m = Math.abs(A[l]) > Math.abs(A[r]) ? r++ : l--;
            }
            res[i++] = A[m] * A[m];
            // System.out.println(m);
        }
        return res;
    }
}
