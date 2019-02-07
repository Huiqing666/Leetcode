class Solution {
    public int kthGrammar(int N, int K) {
        //01101001 10010110
        return Integer.bitCount(K - 1) & 1;
    }
}
