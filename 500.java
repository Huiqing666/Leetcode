class Solution {
    public String[] findWords(String[] words) {
        
        ArrayList<String> res = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (canInOneLine(words[i])) {
                res.add(words[i]);
            }
        }
        return res.toArray(new String[0]); 
    }
    private boolean canInOneLine(String word) {
        if (word.length() < 2) return true;
        Character[] line1 = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'};
        Character[] line2 = {'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l'};
        Character[] line3 = {'z', 'x', 'c', 'v', 'b', 'n', 'm'};
        HashSet<Character> set1 = new HashSet<>(Arrays.asList(line1));
        HashSet<Character> set2 = new HashSet<>(Arrays.asList(line2));
        HashSet<Character> set3 = new HashSet<>(Arrays.asList(line3));
        
        char[] letters = word.toLowerCase().toCharArray();
        if (set1.contains(letters[0])) {
            for(char c : letters) {
                if (!set1.contains(c)) return false;
            }
            
        }
        if (set2.contains(letters[0])) {
            for(char c : letters) {
                if (!set2.contains(c)) return false;
            }
            
        }
        if (set3.contains(letters[0])) {
            for(char c : letters) {
                if (!set3.contains(c)) return false;
            }
            
        }
        return true;
    }
}
