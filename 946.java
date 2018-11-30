class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stk = new Stack<>();
        int i = 0;
        int len = popped.length;
        int j = 0;
        while (i < len) {
            if (!stk.isEmpty() && stk.peek() == popped[i]) {
                stk.pop();
                i++;
            }
            else if (j < len){
                stk.push(pushed[j++]);
            }
            else {
                return false;
            }
        }

        return true;
        
    }
}
