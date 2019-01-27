class Solution {
    public int firstUniqChar(String s) {
        int[] index = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int curr = (int) (s.charAt(i) - 'a');
            if (index[curr] < 0) {
                continue;
            }
            else if (index[curr] > 0) {
                index[curr] = -1;
            }
            else {
                // System.out.println(curr);
                index[curr] = i + 1;
            }
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 26; i++) {
            
            if (index[i] > 0) min = Math.min(min, index[i]);
        }
        
        return min == Integer.MAX_VALUE ? -1 : min - 1;
    }
}
