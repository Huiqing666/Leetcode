class MaxStack {
    Stack<Integer> stk;
    Stack<Integer> maxStk;
    /** initialize your data structure here. */
    public MaxStack() {
        stk = new Stack<>();
        maxStk = new Stack<>();
    }
    
    public void push(int x) {
        stk.push(x);
        if (maxStk.isEmpty() || maxStk.peek() < x) {
            maxStk.push(x);
        }
        else {
            maxStk.push(maxStk.peek());
        }
    }
    
    public int pop() {
        maxStk.pop();
        return stk.pop();
    }
    
    public int top() {
        // System.out.println(maxStk.peek());
        return stk.peek();
    }
    
    public int peekMax() {
        return maxStk.peek();
    }
    
    public int popMax() {
        Stack<Integer> temp = new Stack<>();
        int max = maxStk.peek();
        // System.out.println(stk.peek() + " " + maxStk.peek());
        while (stk.peek() != max) {
            //System.out.println(maxStk.peek());
            temp.push(stk.pop());
            maxStk.pop();
        }
        // System.out.println(maxStk.peek());
        maxStk.pop();
        int res = stk.pop();
        
        while (!temp.isEmpty()) {
            this.push(temp.pop());
            
        }
        
        return res;
    }
}

/**
 * Your MaxStack object will be instantiated and called as such:
 * MaxStack obj = new MaxStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.peekMax();
 * int param_5 = obj.popMax();
 */
