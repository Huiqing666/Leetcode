class StringIterator {
    Queue<int[]> q = new LinkedList<>();
    public StringIterator(String s) {
        int j = 1;
        for (int i = 0; i < s.length(); i += j) {
            char a = s.charAt(i);
            j = 1;
            while (i + j < s.length() && s.charAt(i + j) - 'A' < 0) {
                j++;
            }
            // System.out.println(s.substring(i + 1, i + j));
            q.add(new int[]{(a - 'A'), Integer.parseInt(s.substring(i + 1, i + j))});
        }
    }
    
    public char next() {
        if (q.isEmpty()) return ' ';
        int[] temp = q.peek();
        if (--temp[1] == 0) q.poll();
        return (char) (temp[0] + 'A');
    }
    
    public boolean hasNext() {
        return !q.isEmpty();
    }
}

/**
 * Your StringIterator object will be instantiated and called as such:
 * StringIterator obj = new StringIterator(compressedString);
 * char param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
