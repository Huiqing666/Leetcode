class Solution {
    public int partitionDisjoint(int[] A) {
        int[] smallestSoFar = new int[A.length + 1];
        
        int[] largestSoFar = new int[A.length + 1];
        int j = A.length;
        smallestSoFar[j] = A[j - 1];
        for (int i = 0; i < A.length; i++) {
            largestSoFar[i + 1] = Math.max(largestSoFar[i], A[i]);
            smallestSoFar[j - 1] = Math.min(smallestSoFar[j], A[j - 1]);
            j--;
        }
        for (int i = 1; i <= A.length; i++) {
            if (largestSoFar[i] <= smallestSoFar[i]) return i;
        }
        return 0;
    }
}
