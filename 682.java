class Solution {
    public int calPoints(String[] ops) {
        int res = 0;
        Stack<Integer> q = new Stack<>();
        for(int i = 0; i < ops.length; i++) {
            if (ops[i].equals("C")) {
                if (!q.isEmpty()) {
                    // System.out.println(q.peek());
                    res -= q.pop();
                    
                }
            }
            else if (ops[i].equals("D")) {
                if (!q.isEmpty()) {
                    int pre = 2 * q.peek();
                    res += pre;
                    q.push(pre);
                    
                }
            }
            else if (ops[i].equals("+")) {
                int pre = 0;
                int curr = 0;
                if (!q.isEmpty()) {
                    pre = q.pop();
                    
                    curr = pre;
                    res += pre;
                }
                else continue;
                if (!q.isEmpty()) {
                    curr += q.peek();
                    
                    res += q.peek();        
                }
                q.push(pre);
                q.push(curr);
            }
            else {
                q.push(Integer.parseInt(ops[i]));
                res += q.peek();
            }
        }
        return res;
    }
}
