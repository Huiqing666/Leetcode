class Solution {
    public int[] dailyTemperatures(int[] T) {
        Stack<Integer> smaller = new Stack<Integer>();
        int[] res = new int[T.length];
        for (int i = 0; i < T.length; i++) {
            while (!smaller.isEmpty() && T[smaller.peek()] < T[i]) {
                int idx = smaller.pop();
                res[idx] = i - idx;
            }
            smaller.push(i);           
        }
        return res;
    }
}
