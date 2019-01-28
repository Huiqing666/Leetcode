class Solution {
    public int[] fairCandySwap(int[] A, int[] B) {
        int sumA = 0;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            set.add(A[i]);
            sumA += A[i];
        }
        int sumB = 0;
        for (int j = 0; j < B.length; j++) {
            sumB += B[j];
        }
        if (sumA > sumB) {
            int dis = (sumA - sumB) / 2;
            for (int i = 0; i < B.length; i++) {
                if (set.contains(B[i] + dis)) {
                    return new int[]{B[i] + dis, B[i]};
                }
            }
        }
        else {
            int dis = (sumB - sumA) / 2;
            for (int i = 0; i < B.length; i++) {
                if (set.contains(B[i] - dis)) {
                    return new int[]{B[i] - dis, B[i]};
                }
            }
        }
        return new int[2];
    }
}
