class ExamRoom {
    
    TreeSet<Integer> seated;
    int N;
    public ExamRoom(int N) {
        this.N = N;
        seated = new TreeSet<>();
    }
    
    public int seat() {
        if (seated.isEmpty()) {
            seated.add(0);
            return 0;
        }
    
        Iterator<Integer> it = seated.iterator();
        
        int prev = seated.first();
        int maxPrev = seated.first();
        int add = 0;
        while(it.hasNext()) {
            int curr = it.next();
            if ((curr - prev) / 2 > add) {
                add = (curr - prev) / 2;
                
                maxPrev = prev;
                
            }
            prev = curr;
        }
        if ((N - prev - 1) / 2 > add) {
            add = (N - prev -1) / 2;
        }
        if (seated.first() != 0 || seated.last() != (N-1)) {
            //System.out.println(add);
            if (seated.first() != 0 && seated.first() - 0 >= add && seated.first() - 0 >= (N - 1 - seated.last())) {
                seated.add(0);
                return 0;
            }
            if ((N - 1 - seated.last()) > add){
                //System.out.println(N-1);
                seated.add(N-1);
                return N-1;
            }
        }
        seated.add(maxPrev + add);
        return maxPrev + add;
        
    }
    
    public void leave(int p) {
        seated.remove(p);
    }
}

/**
 * Your ExamRoom object will be instantiated and called as such:
 * ExamRoom obj = new ExamRoom(N);
 * int param_1 = obj.seat();
 * obj.leave(p);
 */
