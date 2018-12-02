class Solution {
    public int lengthLongestPath(String input) {
        int level = -1;
        Stack<Integer> stk = new Stack<>();
        String[] ss = input.split("\n");
        int maxLen = 0;
        int len = 0;
        for (int i = 0; i < ss.length; i++) {
            int currlevel = ss[i].split("\t").length - 1;
            if (currlevel > level) {
                if (ss[i].contains(".")) {
                    len += ss[i].length() - currlevel;
                    maxLen = Math.max(len, maxLen);
                    stk.push(ss[i].length() - currlevel);
                }
                else {
                    len += ss[i].length() - currlevel + 1;
                    stk.push(ss[i].length() - currlevel + 1);
                    
                }                
                level = currlevel;
            }
            else {
                while (currlevel <= level) {
                    len -= stk.pop();
                    level--;
                }
                i--;
            }
        }
        return maxLen;
    }
}
