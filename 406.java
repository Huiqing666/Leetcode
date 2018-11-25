class Solution {
    public int[][] reconstructQueue(int[][] people) {
        if (people.length == 0) return new int[0][0];
        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                if (a[0] == b[0]) {
                    return a[1] - b[1];
                }
                else {
                    return b[0] - a[0];
                }
            }
        });
        ArrayList<int[]> list = new ArrayList<int[]>();
        for (int i = 0; i < people.length; i++) {
            list.add(people[i][1], people[i]);
        }
        int[][] res = new int[people.length][people[0].length];
        for (int i = 0; i < people.length; i++) {
            res[i][0] = list.get(i)[0];
            res[i][1] = list.get(i)[1];
        }
        return res;
        
    }
}
