class Solution {
    public int minDistance(int height, int width, int[] tree, int[] squirrel, int[][] nuts) {
        int dis = 0;
        for (int i = 0; i < nuts.length; i++) {
            dis += 2 * (Math.abs(nuts[i][0] - tree[0]) + Math.abs(nuts[i][1] - tree[1]));
        }
        // System.out.println(dis);
        int min = Integer.MIN_VALUE;
        for (int i = 0; i < nuts.length; i++) {
            min = Math.max(min, Math.abs(nuts[i][0] - tree[0]) + Math.abs(nuts[i][1] - tree[1]) - Math.abs(nuts[i][0] - squirrel[0]) - Math.abs(nuts[i][1] - squirrel[1]));
        }
        return dis - min;
    }
}
