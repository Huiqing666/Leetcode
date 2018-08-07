class Solution {
    public boolean isSubsequence(String s, String t) {
        int len = s.length();
        int j = 0; 
        for(int i = 0; i < len; i++) {
            while(j < t.length() && t.charAt(j) != s.charAt(i)) {
                j++;
            }
            if(j == t.length()) return false;
            if(t.charAt(j) == s.charAt(i)) j++;
        }
        return true;
    }
}
