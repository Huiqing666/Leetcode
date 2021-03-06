public class Vector2D implements Iterator<Integer> {

    Iterator<List<Integer>> i;
    Iterator<Integer> j;
    public Vector2D(List<List<Integer>> vec2d) {
        i = vec2d.iterator();
    }

    @Override
    public Integer next() {
        return j.next();
    }

    @Override
    public boolean hasNext() {
        while(j == null || !j.hasNext()) {
            if(i.hasNext()) j = i.next().iterator();
            else break;
        }
        if (j == null) return false;
        return j.hasNext();
    }
}

/**
 * Your Vector2D object will be instantiated and called as such:
 * Vector2D i = new Vector2D(vec2d);
 * while (i.hasNext()) v[f()] = i.next();
 */
