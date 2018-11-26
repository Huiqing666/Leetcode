class Solution {
    public int minDeletionSize(String[] A) {
        if (A.length == 0) return 0;
        int count = 0;
        int len = A[0].length();
        for (int i = 0; i < len; i++) {
            // System.out.println(i);
            int curr = (int)(A[0].charAt(i) - 'a');
            for (int j = 1; j < A.length; j++) {
                if (A[j].charAt(i) - 'a' >= curr) {
                    curr = (int)(A[j].charAt(i) - 'a');
                }
                else {
                    count++;
                    break;
                }
                
            }
        }
        return count;
        
    }
}
