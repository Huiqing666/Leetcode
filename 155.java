class MinStack {
    private Stack<Integer> stk;
    int min;

    /** initialize your data structure here. */
    public MinStack() {
        stk = new Stack<Integer>();
        min = Integer.MAX_VALUE;
    }
    
    public void push(int x) {
        if(x <= min){
            stk.push(min);
            min = x;

        }
        stk.push(x);
        
    }
    
    public void pop() {
        if(stk.pop() == min){
            min = stk.pop();
        }
    }
    
    public int top() {
        return stk.peek();
        
    }
    
    public int getMin() {
        return min;
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
