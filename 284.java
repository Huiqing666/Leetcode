// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html
class PeekingIterator implements Iterator<Integer> {
    Queue<Integer> q;
    Iterator<Integer> iterator;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
	    this.iterator = iterator;
        q = new LinkedList<>();
	}

    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        if (!q.isEmpty()) return q.peek();
        if (iterator.hasNext()) {
            q.add(iterator.next());
            return q.peek();
        }
        return null;
	}

	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    if (!q.isEmpty()) {
            return q.poll();
        }
        return iterator.next();
	}

	@Override
	public boolean hasNext() {
	    return this.iterator.hasNext() || !q.isEmpty();
	}
}
