class Solution {
    public List<Integer> shortestDistanceColor(int[] colors, int[][] queries) {
        int[][] dis = new int[3][colors.length];
        for (int i = 0; i < 3; i++) {
            Arrays.fill(dis[i], Integer.MAX_VALUE);
        }
        for (int i = 1; i < 4; i++) {
            for (int j = 0; j < colors.length; j++) {
                if (colors[j] == i) {
                    dis[i-1][j] = 0;
                }
                else if (j > 0 ){
                    if (dis[i-1][j-1] == Integer.MAX_VALUE) {
                        dis[i-1][j] = Integer.MAX_VALUE;
                    }
                    else {
                        dis[i-1][j] = dis[i-1][j-1]+1;
                    }
                }
                else {
                    continue;
                }
            }
        }
        for (int i = 1; i < 4; i++) {
            for (int j = colors.length - 1; j >= 0; j--) {
                if (colors[j] == i) {
                    dis[i-1][j] = 0;
                }
                else if (j < colors.length - 1 ){
                    if (dis[i-1][j+1] != Integer.MAX_VALUE) {
                        dis[i-1][j] = Math.min(dis[i-1][j+1]+1, dis[i-1][j]);
                    }
                }
                else {
                    continue;
                }
            }
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < queries.length; i++) {
            int res = dis[queries[i][1]-1][queries[i][0]];
            if (res == Integer.MAX_VALUE) res = -1;
            list.add(res);
        }
        return list;
    }
}