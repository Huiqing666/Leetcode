class Solution {
    public int shortestSubarray(int[] A, int K) {
        int min = A.length+1;
        int[] sum = new int[A.length+1];
        sum[0] = 0;
        for(int i= 0; i < A.length; i++) {
            sum[i+1] = sum[i] + A[i];
        }
        Deque<Integer> deque = new LinkedList<Integer>();
        deque.add(0);
        for(int i = 1; i <= A.length; i++) {
            while (!deque.isEmpty() && sum[deque.peekLast()] >= sum[i]) { 
                deque.pollLast();
            }
            
            while (!deque.isEmpty() && sum[i] - sum[deque.peekFirst()] >= K) {
                min = Math.min(min, i - deque.pollFirst());
            }
            deque.offerLast(i);
        }
        if(min == (A.length + 1)){
            return -1;
        }
        return min;

     }
}
