class Solution {
    public boolean hasAlternatingBits(int n) {
        int pre = n & 1;
        while (n > 0) {
            n = n >> 1;
            if ((n & 1) == pre) return false;
            pre = n & 1;
        }
        return true;
        
    }
}
