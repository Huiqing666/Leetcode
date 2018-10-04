class Solution {
    public boolean checkValidString(String s) {
        //one pass
        int min = 0, max = 0;
        char[] c = s.toCharArray();
        for(int i = 0; i < c.length; i++) {
            if(c[i] == '(') {
                min++;
                max++;
            }
            if(c[i] == ')') {
                if(min > 0) min--;
                max--;
            }
            if(c[i] == '*') {
                if(min > 0) min--;
                max++;
            }
            if(max < 0) return false;
        }
        return min == 0;
        
    }
}
