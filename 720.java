class Solution {
    String res = "";
    public String longestWord(String[] words) {
        HashSet<String> set = new HashSet<>();
        char[] c = new char[26];
        for(String s : words) {
            set.add(s);
            if(s.length() == 1) {
                c[s.charAt(0) - 'a'] = 1;
            }
        }
        for(int i = 0; i < 26; i++) {
            if(c[i] == 1) {
                char x = 'a';
                x += i;
                String before = String.valueOf(x);
                dfs(set, before);    
            }
        }
        return res;
    }
    private void dfs(HashSet<String> set, String before) {
        if(before.length() > res.length()) {                  
                    res = before;
                    //System.out.println(res);                  
        }
        for(int j = 0; j < 26; j++) {
            char y = 'a';
            y += j;
            String curr = before + String.valueOf(y);
            if(set.contains(curr)){
                if(curr.length() > res.length()) {                  
                    res = curr;
                    //System.out.println(res);
                   
                }
                dfs(set, curr);
            }
        }
    }
}
