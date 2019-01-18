class Solution {
    public boolean repeatedSubstringPattern(String s) {
        for (int i = 1; i <= s.length() / 2; i++) {
            String pat = s.substring(0, i);
            int index = i;
            while (index + i <= s.length() && s.substring(index, index + i).equals(pat)) {
                index = index + i;
            }
            if (index == s.length()) {
                return true;
            }
        }
        return false;
    }
}
