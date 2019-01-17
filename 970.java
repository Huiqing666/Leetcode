class Solution {
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; Math.pow(x, i) < bound; i++) {
            for (int j = 0; Math.pow(x, i) + Math.pow(y, j) <= bound; j++) {
                set.add((int)Math.pow(x, i) + (int)Math.pow(y, j));
                if (y == 0 || y == 1) break;
            }
            if (x == 0 || x == 1) break;
        }
        return new ArrayList<Integer>(set);
        
    }
}
