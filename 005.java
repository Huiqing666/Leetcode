class Solution {
    private int lo = 0, length = 0;
    public String longestPalindrome(String s) {
        int len = s.length();
        for(int i = 0; i < len - 1; i++){
            palindrome(s, i, i+1);
            palindrome(s, i, i);
        }
        return s.substring(lo, lo + length);
    }
    private void palindrome(String s, int i, int j){
        while(i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)){
            i--;
            j++;
        }
        if(length < j - i - 1){
            lo = i + 1;
            length = j - i - 1;
        }
    }
}
