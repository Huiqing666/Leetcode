class Solution {
    public boolean validPalindrome(String s) {
        char[] a = s.toCharArray();
        int count = 0;
        for(int i = 0; i < a.length/2; i++) {
            if(a[i] == a[a.length - 1 - i]){
                continue;
            }else{
                return subPalindrome(s.substring(i+1, a.length -i)) || subPalindrome(s.substring(i, a.length - i - 1));
            }
        }  
        return true;
    }
    private boolean subPalindrome(String s){
        for(int i = 0; i < s.length()/2; i++) {
            if(s.length() - i - 1 >= 0 && s.charAt(i) != s.charAt(s.length() - 1 - i)){
                return false;
            }
        }
        return true;
    }
}
