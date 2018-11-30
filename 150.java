class Solution {
    public int evalRPN(String[] strs) {
        Stack<Integer> stk = new Stack<>();
        for (int i = 0; i < strs.length; i++) {
            String s = strs[i];
            if (s.equals("+")) {
                int right = stk.pop();
                int left = stk.pop();
                stk.push(left+right);
            }
            else if (s.equals("-")) {
                int right = stk.pop();
                int left = stk.pop();
                stk.push(left-right);
            }
            else if (s.equals("*")) {
                int right = stk.pop();
                int left = stk.pop();
                stk.push(left*right);
            }
            else if (s.equals("/")) {
                int right = stk.pop();
                int left = stk.pop();
                stk.push(left/right);
            }
            else{
                stk.push(Integer.valueOf(s));
            }
        }
        return stk.pop();

    }
}
