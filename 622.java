class MyCircularQueue {

    /** Initialize your data structure here. Set the size of the queue to be k. */
    Integer[] arr;
    int start;
    public MyCircularQueue(int k) {
        arr = new Integer[k];
        start = 0;
    }
    
    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if (this.isFull()) return false;
        boolean has = false;
        for (int i = start; i < arr.length; i++) {
            if (arr[i] == null) {
                arr[i] = value;
                return true;
            }
        }
        for (int i = 0; i < start; i++) {
            if (arr[i] == null) {
                arr[i] = value;
                return true;
            }
        }
        return true;
    }
    
    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        // System.out.println(start);
        if (this.isEmpty()) return false;
        arr[start] = null;
        if ((start == arr.length - 1 && arr[0] != null) || this.isEmpty()) start = 0;
        else if (arr[start + 1] != null) start++;
        return true;
    }
    
    /** Get the front item from the queue. */
    public int Front() {
        // System.out.println(start);
        if (this.isEmpty()) return -1;
        return arr[start];
    }
    
    /** Get the last item from the queue. */
    public int Rear() {
        // System.out.println(start);
        if (this.isEmpty()) return -1;

        for (int i = start - 1; i >= 0; i--) {
            if (arr[i] != null) return arr[i];
        }
        for (int i = arr.length -1; i >= start; i--) {
            if (arr[i] != null) {
                return arr[i];
            }
        }
        return -1;

    }
    
    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                return false;
            }
        }
        return true;
    }
    
    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                return false;
            }
        }
        return true;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
