class Solution {
    public boolean rotateString(String A, String B) {
        if(A.length() != B.length())return false;
        if((A + A).contains(B))return true;
        return false;
        
        
        
    }
}
