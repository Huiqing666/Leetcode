class Solution {
    public int titleToNumber(String s) {
        int len = s.length();
        int res = 0;
        for(int i = 0; i < len; i++){
            res = res * 26;
            res = res + (int)(s.charAt(i) - 'A' + 1);
            //System.out.println(res);
            
        }
        return res;
    }
}
