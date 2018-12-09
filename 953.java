class Solution {
    public boolean isAlienSorted(String[] words, String o) {
        // compare one by one
        // with early return
        HashMap<Character, Integer> map = new HashMap<>();
        int w = 0;
        for (int i = 0; i < o.length(); i++) {
            map.put(o.charAt(i), w++);
        }
        for (int i = 0; i < words.length -1; i++) {
            String left = words[i];
            String right = words[i+1];
            int j = 0;
            while (left.charAt(j) == right.charAt(j)) {
                j++;
                if (j == left.length() || j == right.length()) break;
            }
            if (j == left.length() || j == right.length()) {
                if (left.length() > right.length()) return false;
            }
            if (map.get(left.charAt(j)) > map.get(right.charAt(j))) return false;       
            
        }
        return true;
        
    }
}
