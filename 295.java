class MedianFinder {
    PriorityQueue<Double> max = new PriorityQueue<Double>((a, b) -> (int)(b - a));
    PriorityQueue<Double> min = new PriorityQueue<>();

    /** initialize your data structure here. */
    public MedianFinder() {
        
    }
    
    public void addNum(int n) {
        //System.out.println(n);
        double num = (double) n;
        if (max.size() == min.size()) {
            if (max.size() == 0 || num <= min.peek()) max.add(num);
            else {
                max.add(min.poll());
                min.add(num);
            }
        }
        else {
            if (num <= max.peek()) {
                min.add(max.poll());
                max.add(num);
            }
            else{
                min.add(num);
            }
        }
        
    }
    
    public double findMedian() {
        if (max.size() == min.size()) {
            // System.out.println(max.peek() + "  " + min.peek());
            return (max.peek() + min.peek())/2;
        }
        else return max.peek();
        
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
