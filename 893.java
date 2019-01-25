class Solution {
    public int numSpecialEquivGroups(String[] A) {
        
        Set<String> set = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            int[] odd = new int[26];
            int[] even = new int[26];
            for (int j = 0; j < A[i].length(); j++) {
                if (j % 2 == 1) {
                    odd[A[i].charAt(j) - 'a']++;
                }
                else {
                    even[A[i].charAt(j) - 'a']++;
                }
            }
            set.add(Arrays.toString(odd) + Arrays.toString(even));
        }
        return set.size();
        
    }
}
