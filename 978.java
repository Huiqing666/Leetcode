class Solution {
    public int maxTurbulenceSize(int[] A) {
        if (A.length < 2) return A.length;
        int i = 1;
        int res = 0;
        while (i < A.length) {
            int count = 0;
            while (i < A.length) {
                if (i % 2 == 0 && A[i] > A[i - 1]) {
                    count++;
                }
                else if (i % 2 == 1 && A[i] < A[i -1]) {
                    count++;
                }
                else {
                    res = Math.max(res, count);
                    break;
                }
                i++;
                if (i == A.length) res = Math.max(res, count);
            }
            i++;  
        }
        i = 1;        
        while (i < A.length) {
            int count = 0;
            while (i < A.length) {
                if (i % 2 == 0 && A[i] < A[i - 1]) {
                    count++;
                }
                else if (i % 2 == 1 && A[i] > A[i -1]) {
                    count++;
                }
                else {
                    System.out.println(i);
                    res = Math.max(res, count);
                    break;
                }
                i++;
                if (i == A.length) res = Math.max(res, count);
            }
            i++;  
        }
        return res + 1;
    }
}
