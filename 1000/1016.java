class Solution {
    public boolean queryString(String S, int N) {
        
        // only need to check half
        for (int i = N; i > N/2; i--) {
            if (!S.contains(Integer.toBinaryString(i))) {
                return false;
            }
        }
        return true;
        
    }
}
