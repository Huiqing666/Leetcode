class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<Character>();
        int len = s.length();
        char current;
        for(int i = 0; i < len; i++){
            current = s.charAt(i);
            if(current == '(' || current =='{' || current == '['){
                stk.push(current);
            }else if(current == ')'){
                if(stk.empty() ||stk.peek() != '(')return false;
                else stk.pop();
            }else if(current =='}'){
                if(stk.empty() ||stk.peek() != '{')return false;
                else stk.pop();
            }else if(current == ']'){
                if(stk.empty() ||stk.peek() != '[') return false;
                else stk.pop();
            }      
        }
        if(stk.empty())return true;
        else return false;
        
        
    }
}
