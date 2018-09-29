class Solution {
    public boolean isMonotonic(int[] A) {
        int len = A.length;
        if(len < 2) return true;
        int i = 1;
        for(; i < len; i++){
            if(A[i] < A[i-1]) break;
        }
        if(i == len) return true;
        for(i = 1; i < len; i++) {
            if(A[i] > A[i-1]) break;
        }
        if(i == len) return true;
        return false;
        
    }
}
