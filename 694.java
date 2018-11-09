class Solution {
    public int numDistinctIslands(int[][] grid) {
        Set<String> res = new HashSet<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                StringBuilder sb = new StringBuilder();
                helper(grid, i, j, sb, "o");
                //System.out.println(sb.toString().length());
                if(sb.length() > 0)res.add(sb.toString());
            }
        }
        return res.size();
        
    }
    private void helper(int[][] grid, int i, int j, StringBuilder sb, String dir) {
        
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length
           || grid[i][j] == 0) return;
        sb.append(dir);
        grid[i][j] = 0;
        helper(grid, i - 1, j, sb, "l");
        helper(grid, i + 1, j, sb, "r");
        helper(grid, i, j - 1, sb, "u");
        helper(grid, i, j + 1, sb, "d");
        sb.append("b");
    }
}
