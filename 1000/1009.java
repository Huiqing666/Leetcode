class Solution {
    public int bitwiseComplement(int N) {
        if (N == 0) return 1;
        int res = 0;
        int mul = 1;
        while (N > 0) {
            res += (1 - N & 1) * mul;
            N = N / 2;
            mul = mul * 2;
        }
        return res;
        
    }
}
