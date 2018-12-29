class Solution {
    public boolean isPowerOfTwo(int n) {
        int l = 0;
        int h = 32;
        if (n == 1) return true;
        if (n % 2 == 1) return false;
        while (l <= h) {
            int m = (l + h) / 2;
            //System.out.println(1 << m);
            if (1 << m == n) return true;
            if (1 << m > n) h = m - 1;
            else l = m + 1;
        }
        return false;
        
    }
}
