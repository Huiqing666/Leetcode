class Solution {
    public int longestConsecutive(int[] num) {
        int res = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int n : num) {
            if (!map.containsKey(n)) {
                int left = (map.containsKey(n - 1)) ? map.get(n - 1) : 0;
                int right = (map.containsKey(n + 1)) ? map.get(n + 1) : 0;
                // sum: length of the sequence n is in
                int sum = left + right + 1;
                //System.out.println("n: " + n + "sum: " + sum);
                map.put(n, sum);//duplicate control
                //[0, -2, 2, -4, 4, 5, -8, 7, 10]
                //[0, -1, -2, 2, -3, -4, 4, 5, 6, -8, 7]

                // keep track of the max length 
                res = Math.max(res, sum);

                // extend the length to the boundary(s)
                // of the sequence
                // will do nothing if n has no neighbors
                map.put(n - left, sum);
                map.put(n + right, sum);
            }
        }
        System.out.println(map.keySet().toString());
        return res;       
    }
}
