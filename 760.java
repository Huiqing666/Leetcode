class Solution {
    public int[] anagramMappings(int[] A, int[] B) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < B.length; i++) {
            List<Integer> index = map.getOrDefault(B[i], new ArrayList<>());
            index.add(i);
            map.put(B[i], index);
        }
        int[] res = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            List<Integer> index = map.get(A[i]);
            res[i] = index.get(0);
            index.remove(0);
            map.put(A[i], index);
        }
        return res;
    }
}
