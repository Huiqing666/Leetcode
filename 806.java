class Solution {
    public int[] numberOfLines(int[] widths, String S) {
        char[] c = S.toCharArray();
        int[] res = new int[2];
        res[0] = 1;
        int curr = 0;
        for(int i = 0; i < c.length; i++) {
            int width = widths[c[i] - 'a'];
            
            if(curr+width > 100) {
                curr = width;
                res[0]++;
            }else {
                curr += width;
            }
            //System.out.println(curr);
            
        }
        res[1] = curr;
        

        return res;
    }
}
