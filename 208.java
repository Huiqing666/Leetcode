class TrieNode {
        public char val;
        public boolean isWord;
        public TrieNode[] children = new TrieNode[26];
        public TrieNode() {}
        public TrieNode(char val) {
            TrieNode node = new TrieNode();
            node.val = val;
        }
        
    }
class Trie {
    

    TrieNode root;
    /** Initialize your data structure here. */
    public Trie() {
        root = new TrieNode();
        root.val = ' ';
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode curr = root;
        char[] letters = word.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            char c = letters[i];
            if (curr.children[c - 'a'] == null) {
                curr.children[c - 'a'] = new TrieNode(c);
            }
            curr = curr.children[c - 'a'];
        }
        curr.isWord = true;
        
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode curr = root;
        char[] letters = word.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            char c = letters[i];
            if (curr.children[c - 'a'] != null) {
                curr = curr.children[c - 'a'];
            }
            else {
                return false;
            }
        }
        return curr.isWord;
        
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TrieNode curr = root;
        char[] letters = prefix.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            char c = letters[i];
            if (curr.children[c - 'a'] != null) {
                curr = curr.children[c - 'a'];
            }
            else {
                return false;
            }
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
