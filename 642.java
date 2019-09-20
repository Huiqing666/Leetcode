class AutocompleteSystem {
    
    class TrieNode {
        char c;
        int freq;
        TrieNode[] children;
        boolean isEnd;
        TrieNode(char c) {
            this.c = c;
            this.freq = 0;
            this.children = new TrieNode[27];
            this.isEnd = false;
        }
    }
    
    class Pair {
        String s;
        int c;
        public Pair(String s, int c) {
            this.s = s; this.c = c;
        }
    }
    
    TrieNode root;
    TrieNode node;
            
    private void insert(String s, int time) {
        TrieNode curr = root;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int idx = (int) (c - 'a');
            if (c == ' ') {
                idx = 26;
            }
            if (curr.children[idx] == null) {
                curr.children[idx] = new TrieNode(c);
            }
            curr = curr.children[idx];
        }
        curr.isEnd = true;
        curr.freq += time;
    }
    public AutocompleteSystem(String[] sentences, int[] times) {
        root = new TrieNode('*');
        node = root;
        for (int i = 0; i < sentences.length; i++) {
            insert(sentences[i], times[i]);
        }
    }
    
    StringBuilder sb = new StringBuilder();
    boolean noPre = false;
    public List<String> input(char c) {
        List<String> res = new LinkedList<>();
        if (c == '#') {
            insert(sb.toString(), 1);
            sb = new StringBuilder();
            node = root;
            return res;
        }
        if (sb.length() > 0 && noPre) {
            sb.append(c);
            return res;
        }
        if (sb.length() == 0) {
            noPre = false;
        }
        sb.append(c);
        // search current character in Trie
        int idx = (int) (c - 'a');
        if (c == ' ') idx = 26;
        if (node.children[idx] == null) {
            noPre = true;
            return res;
        }
        // curr node not null, find top match
        dfs(node.children[idx], sb);
        node = node.children[idx];
        int k = 3;
        while (pq.size() > 0 && k > 0) {
            res.add(pq.poll().s);
            k--;
        }
        pq.clear();
        return res;
        
    }

    PriorityQueue<Pair> pq = new PriorityQueue<Pair>((a, b) -> (a.c == b.c ? a.s.compareTo(b.s) : b.c - a.c));
    private void dfs(TrieNode node, StringBuilder sbuilder) {
        if (node == null) return;
        if (node.isEnd) {
            pq.offer(new Pair(sbuilder.toString(), node.freq));
        }
        for (int i = 0; i < 27; i++) {
            char c = i == 26 ? ' ' : (char) (i + 'a');
            TrieNode child = node.children[i];
            if (child != null) {
                
                sbuilder.append(c);
                dfs(child, sbuilder);
                sbuilder.deleteCharAt(sbuilder.length() - 1);
            }
        }
    }
}

/**
 * Your AutocompleteSystem object will be instantiated and called as such:
 * AutocompleteSystem obj = new AutocompleteSystem(sentences, times);
 * List<String> param_1 = obj.input(c);
 */
