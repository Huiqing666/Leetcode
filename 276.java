class Solution {
    public int numWays(int n, int k) {
        if(n == 0 || k == 0) return 0;
        if(n == 1) return k;
        int[] a = new int[n];
        a[0] = k;
        a[1] = k * k;
        for(int i = 2; i < n; i++){
            a[i] = a[i - 1] * (k - 1) + a[i - 2] * (k - 1);
        }
        return a[n-1];
    }
}
