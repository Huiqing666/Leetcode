class WordDictionary {
    class TrieNode {
        char c;
        HashMap<Character, TrieNode> children; 
        boolean isEnd;
        TrieNode(char c) {
            this.c = c;
            children = new HashMap<>();
            isEnd = false;
        }
    }
    TrieNode root;
    /** Initialize your data structure here. */
    public WordDictionary() {
        root = new TrieNode('0');
        
    }
    
    /** Adds a word into the data structure. */
    public void addWord(String word) {
        TrieNode curr = root;
        for (int i = 0; i < word.length(); i++) {
            char temp = word.charAt(i);
            TrieNode child = null;
            if (curr.children.get(temp) == null) {
                child = new TrieNode(temp);
                curr.children.put(temp, child);
            } 
            else {
                child = curr.children.get(temp);
            }
            curr = child;
        }
        curr.isEnd = true;  
    }
    
    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
    boolean flag;
    public boolean search(String word) {
        flag = false;
        dfs(word, 0, root);  
        return flag;
    }
    private void dfs(String word, int index, TrieNode curr) {
        if (index == word.length() && curr.isEnd) flag = true;
        if (index >= word.length()) return;
        if (flag) return;
        char c = word.charAt(index);
        if (c == '.' ) {
            for (char child : curr.children.keySet()) {
                dfs(word, index + 1, curr.children.get(child));
            }
        }
        else {
            if (curr.children.get(c) == null) return;
            else {
                dfs(word, index + 1, curr.children.get(c));
            }
        }
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */
