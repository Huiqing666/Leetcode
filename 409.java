class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                int v = map.get(s.charAt(i));
                map.put(s.charAt(i), v+1);
            }else{
                map.put(s.charAt(i), 1);
            }
            
        }
        int count = 0;
        for (int value : map.values()) {
            if(value % 2 == 1) count++;
        }
        return count > 0 ? s.length() - count + 1 : s.length();
    }
}
