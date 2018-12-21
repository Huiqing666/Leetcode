class Solution {
    public int trap(int[] h) {
        int n = h.length;
        if (n < 3) return 0;
        int l = 0, r = n - 1;
        while (l < r && h[l] < h[l+1]) l++;
        while (l < r && h[r] < h[r-1]) r--;
        
        int res = 0;
        while (l < r) {
            int left = h[l];
            int right = h[r];
            
            if (left <= right) {
                while (l < r && left > h[++l]) {
                    res += left - h[l];
                }
            }
            else {
                while (l < r && right > h[--r]) {
                    res += right - h[r];
                }
            }
        }
        return res;
    }
}
