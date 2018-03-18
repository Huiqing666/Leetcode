class MyCalendar {
    TreeMap<Integer, Integer> map;
    public MyCalendar() {
        map = new TreeMap<>();
    }
    public boolean book(int start, int end) {
        if((map.floorKey(start) == null || map.get(map.floorKey(start)) <= start)
            && (map.higherKey(start) == null || map.higherKey(start) >= end)){
            map.put(start, end);
            return true;
        }else{
            return false;
        }
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */
