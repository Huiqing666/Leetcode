class Solution {
    public boolean isPalindrome(String s) {
        if(s.length() == 0) return true;
        char[] letters = s.toLowerCase().toCharArray();
        int i = 0, j = letters.length - 1;
        while(i < j){
            //skip non-alphanumb
            while(i < j && !isAlphanumeric(letters[i])) {
                i++;
            }
            while(j > i && !isAlphanumeric(letters[j])) {
                j--;
            }
            //System.out.println(i + " " + j);
            if(letters[i] != letters[j]) return false;
            else{
                i++;
                j--;
            }
        }
        return true;
        
    }
    private boolean isAlphanumeric(char c) {
        if(c - 'a' >= 0 && (c - 'a') < 26) return true;
        if(c - '0' >= 0 && (c - '0') < 10) return true;
        return false;
    }
}
