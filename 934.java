class Solution {
    int min = Integer.MAX_VALUE;
    class pair {
        int x;
        int y;
        pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    public int shortestBridge(int[][] A) {
        label:
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                if (A[i][j] == 1) {
                    DFS1(A, i, j);
                    // System.out.println("first loop");
                    break label;
                }
                
            }
        }
        Set<pair> set = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                // System.out.println(A[i][j]);
                if (A[i][j] == 1) {                 
                    set.add(new pair(i, j));
                }
            }
        }
        // System.out.println(set.size());
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                if (A[i][j] == 2) {
                    for (pair k : set) {
                        min = Math.min(Math.abs(i -k.x) + Math.abs(j- k.y) - 1, min);
                    }
                }
            }
        }
        return min;
        
    }
    private void DFS1(int[][] A, int i, int j) {
        if (i < 0 || j < 0 || i >= A.length || j >= A[0].length || A[i][j] == 2 || A[i][j] == 0) {
            return;
        }
        // System.out.println("outer i: " + i + "j: " + j);
        if (A[i][j] == 1) {
            A[i][j] = 2;
            // System.out.println("i: " + i + "j: " + j);
            DFS1(A, i + 1, j);
            DFS1(A, i - 1, j);
            DFS1(A, i, j - 1);
            DFS1(A, i, j + 1);
        }
        else return;
    }
}
