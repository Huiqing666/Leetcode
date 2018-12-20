class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> stk = new Stack<>();
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (c[i] == '(') stk.push(i);
            if (c[i] == ')') {
                if (stk.isEmpty() || c[stk.peek()] == ')') stk.push(i);
                else{
                    if (!stk.isEmpty() && c[stk.peek()] == '(') {
                        stk.pop();
                    }                   
                }
            }
        }
        if (stk.isEmpty()) return s.length();
        int res = 0;
        int n = s.length();
        while (!stk.isEmpty()) {
            int curr = stk.pop();
            res = Math.max(res, n - curr - 1);
            // System.out.println(res);
            n = curr;
        }
        res = Math.max(res, n);
        return res;
    }
}
