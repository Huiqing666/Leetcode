class Solution {
    int count = 0;
    public int countSubstrings(String s) {
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            checkPalindrom(c, i, i);
            checkPalindrom(c, i, i+1);
        }
        return count;
        
    }
    private void checkPalindrom(char[] c, int i, int j) {
        while(i >= 0 && j < c.length && c[i] == c[j]) {
            count++;
            i--;
            j++;
        }
        return;
    }
}
