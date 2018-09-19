class Solution {
    public int shortestDistance(String[] words, String word1, String word2) {
        int len = words.length;
        int first = -1;
        int second = -1;
        int min = words.length - 1;
        for (int i = 0; i < len; i++) {
            if(words[i].equals(word1)) {
                first = i;
            }
            if(words[i].equals(word2)) {
                second = i;
            }
            if(first != -1 && second != -1) min = Math.min(min, Math.abs(first - second));
        }
        return min;
    }
}
