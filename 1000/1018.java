class Solution {
    public List<Boolean> prefixesDivBy5(int[] A) {
        
        List<Boolean> res = new ArrayList<>();
        int carry = 0;
        
        for (int i = 0; i < A.length; i++) {
            int curr = carry * 2 + A[i];
            if (curr % 5 == 0) res.add(true);
            else res.add(false);
            carry = curr % 5;
        }
        return res;
    }
}
