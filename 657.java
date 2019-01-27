class Solution {
    int[][] dir = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    public boolean judgeCircle(String moves) {
        int x = 0, y =  0;
        for (int i = 0; i < moves.length(); i++) {
            char c = moves.charAt(i);
            if (c == 'U') {
                x += dir[0][0];
                y += dir[0][1];
            }
            if (c == 'D') {
                x += dir[1][0];
                y += dir[1][1];
            }
            if (c == 'L') {
                x += dir[2][0];
                y += dir[2][1];
            }          
            if (c == 'R') {
                x += dir[3][0];
                y += dir[3][1];
            }
        }
        return x == 0 && y == 0;
        
    }
}
