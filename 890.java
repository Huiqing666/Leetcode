class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> res =  new ArrayList<String>();
        
        for(String w:words){
            if(isMatch(w,pattern)) res.add(w);
        }
        
        return res;
    }
    
    private boolean isMatch(String w, String p){
        int[] wi = new int[26], pi = new int[26];
        if (w.length() != p.length()) return false;
        for(int l=0;l<w.length();l++){
            if(wi[w.charAt(l)-'a'] != pi[p.charAt(l)-'a']) return false;
            wi[w.charAt(l)-'a'] = pi[p.charAt(l)-'a'] = l+1;
        }
        
        return true;
    }
}
