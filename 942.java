class Solution {
    public int[] diStringMatch(String S) {
        int i = 0, j = S.length();
        int[] res = new int[j+1];
        for (int k = 0; k < S.length(); k++) {
            if (S.charAt(k) == 'I') {
                res[k] = i++;
                //System.out.println(i);
            }
            else {
                res[k] = j--;
            }
        }
        res[S.length()] = i;
        return res;
    }
}
