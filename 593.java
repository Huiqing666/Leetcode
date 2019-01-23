class Solution {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        int[] dis = new int[6];
        dis[0] = (p1[0] - p2[0]) * (p1[0] - p2[0]) + (p1[1] - p2[1]) * (p1[1] - p2[1]);
        dis[1] = (p1[0] - p3[0]) * (p1[0] - p3[0]) + (p1[1] - p3[1]) * (p1[1] - p3[1]);
        dis[2] = (p1[0] - p4[0]) * (p1[0] - p4[0]) + (p1[1] - p4[1]) * (p1[1] - p4[1]);
        dis[3] = (p2[0] - p3[0]) * (p2[0] - p3[0]) + (p2[1] - p3[1]) * (p2[1] - p3[1]);
        dis[4] = (p2[0] - p4[0]) * (p2[0] - p4[0]) + (p2[1] - p4[1]) * (p2[1] - p4[1]);
        dis[5] = (p3[0] - p4[0]) * (p3[0] - p4[0]) + (p3[1] - p4[1]) * (p3[1] - p4[1]);
        Arrays.sort(dis);
        // System.out.println(dis)
        if (dis[0] == 0) return false;
        if (dis[0] == dis[3] && dis[4] == 2 * dis[0] && dis[5] == 2 * dis[0]) return true;
        else return false;
    }
}
