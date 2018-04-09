class MovingAverage {
    private int window = 0;
    private int sum = 0;
    private Queue<Integer> queue = new LinkedList<>();

    /** Initialize your data structure here. */
    public MovingAverage(int size) {
        window = size;
        
    }
    private int count = 0;
    public double next(int val) {
        count++;
        if(count <= window) {
            sum += val;
            queue.add(val);
        }else{
            sum -= queue.poll();
            queue.add(val);
            sum += val;
        }
        
        if(count > window) count = window;
        return (double)sum/count;
        
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */
