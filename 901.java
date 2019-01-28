class StockSpanner {
    class Pair {
        int prev;
        int val;
        Pair(int i, int v) {
            prev = i;
            val = v;
        }
    }
    Stack<Pair> dec;
    public StockSpanner() {
        dec = new Stack<>();
    }
    // ArrayList<Integer> list = new ArrayList<>();
    public int next(int price) {
        // list.add(price);
        // System.out.println(price);
        int res = 1;
        while (!dec.isEmpty() && dec.peek().val <= price) {
            res += dec.pop().prev;
        }
        dec.push(new Pair(res, price));
        return res;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
