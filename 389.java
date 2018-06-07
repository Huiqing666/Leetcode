class Solution {
    public char findTheDifference(String s, String t) {
        int[] time = new int[26];
        for(int i = 0; i < s.length(); i++){
            time[s.charAt(i) - 'a']++;
        }
        int j = 0;
        for(; j < t.length(); j++){
            if(--time[t.charAt(j) - 'a'] < 0) break;
        }
        return t.charAt(j);
        
            
    }
}
