class Solution {
    public int maxSubarraySumCircular(int[] A) {
        int total = 0;
        for (int i : A) {
            total += i;
        }
        int temp = A[0];
        // minimum sum
        int min = A[0];
        int len = 1;
        for (int i = 1; i < A.length; i++) {
            if (temp > 0) temp = A[i];
            else {
                temp += A[i];
                len++;
            }
            min = Math.min(min, temp);
        }
        // System.out.println(min);
        
        // maximum sum
        int max = A[0];
        temp = A[0];
        for (int i = 1; i < A.length; i++) {
            if (temp < 0) temp = A[i];
            else temp += A[i];
            max = Math.max(max, temp);
        }
        // System.out.println(max);
        return len != A.length ? Math.max(max, total - min) : max;
    }
}
