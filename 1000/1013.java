class Solution {
    public boolean canThreePartsEqualSum(int[] A) {
        if (A.length < 3) return false;
        int sum = 0;
        for (int a : A) {
            sum += a;
        }
        if (sum % 3 != 0) return false;
        int parts = 0;
        int curSum = 0;
        int index = 0;
        for (int i = 0; i < A.length; i++) {
            curSum += A[i];
            if (curSum == (sum /  3) && parts != 2) {
                curSum = 0;
                parts++;
                if (parts == 2) index = i;
            }
           
        }
        //System.out.println(index);
        if (curSum == (sum /  3) && parts == 2 && index != A.length - 1) return true;
        return false;
        
    }
}
