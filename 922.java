class Solution {
    public int[] sortArrayByParityII(int[] A) {
        if (A.length == 0) return A;
        int i = 0, j = 1;
        while (i < A.length && j < A.length) {
            while (i < A.length && A[i] % 2 == 0) {
                i += 2;
            }
            while (j < A.length &&  A[j] % 2 == 1) {
                j += 2;
            }
            if (i < A.length && j < A.length) {
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }

        }
        return A;
    }
}
