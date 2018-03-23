class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int xx = x;
        int rev = 0;
        while(x > 0){
            rev = rev * 10 + x % 10;
            x = x / 10;
            //System.out.println(rev);
        }
        if(xx == rev) return true;
        else return false;
    }
}
