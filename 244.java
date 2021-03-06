class WordDistance {
    HashMap<String, List<Integer>> map = new HashMap<>();
    public WordDistance(String[] words) {
        for (int i = 0; i < words.length; i++) {
            List<Integer> index = map.getOrDefault(words[i], new ArrayList<>());
            index.add(i);
            map.put(words[i], index);
        }
    }
    
    public int shortest(String word1, String word2) {
        List<Integer> list1 = map.get(word1);
        List<Integer> list2 = map.get(word2);
        int dis = Integer.MAX_VALUE;
        for (int i = 0, j = 0; i < list1.size() && j < list2.size();) {
            int index1 = list1.get(i);
            int index2 = list2.get(j);
            if (index1 < index2) {
                dis = Math.min(dis, index2 - index1);
                i++;
            }
            else {
                dis = Math.min(dis, index1 - index2);
                j++;
            }
        }
        return dis;
    }
}

/**
 * Your WordDistance object will be instantiated and called as such:
 * WordDistance obj = new WordDistance(words);
 * int param_1 = obj.shortest(word1,word2);
 */
