class Solution {
    public int minAddToMakeValid(String S) {
        Stack<Character> stk = new Stack<>();
        int count = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '(') {
                stk.push('(');
            }
            else if (stk.isEmpty()) {
                count++;
            }
            else{
                stk.pop();
            }
        }
        return count + stk.size();
        
    }
}
