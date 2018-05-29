class Solution {
    public int nthUglyNumber(int n) {
        if(n < 1) return 0;
        PriorityQueue<Long> q = new PriorityQueue<>();
        q.add(1l);
        for(int i = 1; i < n; i++){
            long tmp = q.poll();
            
            while(!q.isEmpty() && q.peek() == tmp) tmp = q.poll();
            //System.out.println(tmp);
            q.add(tmp * 2);
            q.add(tmp * 3);
            q.add(tmp * 5);
        }
        return q.peek().intValue();
        
    }
}
