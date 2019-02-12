class Solution {
    public boolean equationsPossible(String[] e) {
        int[] c = new int[26];
        Arrays.fill(c, -1);
        for (int i = 0; i < e.length; i++) {
            if (e[i].charAt(1) == '=') {
                int a = Integer.valueOf(e[i].charAt(0) - 'a');
                int b = Integer.valueOf(e[i].charAt(3) - 'a');
                //System.out.println(b);
                union(a, b, c);
            }
        }
        for (int i = 0; i < e.length; i++) {
            if (e[i].charAt(1) == '!') {
                int a = Integer.valueOf(e[i].charAt(0) - 'a');
                int b = Integer.valueOf(e[i].charAt(3) - 'a');
                
                //System.out.println(b);
                if (find(a, c) == find(b, c)) return false;
            }
        }
        return true;
    }
    private int find(int a, int[] c){
        if (c[a] == -1) {
            return a;
        }
        // System.out.println(c[a]);
        return find(c[a], c);
    }
    private void union(int a, int b, int[] c) {
        if (a == b) return;
        int x = find(a, c);
        int y = find(b, c);
        if (x == y) return;
        c[x] = y;
    }
}
