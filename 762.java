class Solution {
    public int countPrimeSetBits(int L, int R) {
        int count = 0;
        Set<Integer> set = new HashSet<>(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29));
        for (int i = L; i <= R; i++) {
            int bits = 0;
            for (int j = i; j >= 1; j = j >> 1) {
                bits += j & 1;
            }
            if (set.contains(bits)) count++;
        }
        return count;
    }
}
