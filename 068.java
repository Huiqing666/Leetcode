class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> res = new ArrayList<String>();
        int start = 0;
        int len = 0;
        for (int i = 0; i < words.length; i++) {
            len += words[i].length() + 1;
            if (len > maxWidth + 1) {
                // System.out.println(len);
                res.add(manipulate(words, start, i - 1, maxWidth));
                start = i;
                len = words[i].length() + 1;
            }
        }
        // System.out.println(start);
        if (start != words.length) res.add(lastSen(words, start, words.length - 1, maxWidth));
        return res;
        
        
    }
    private String manipulate(String[] words, int start, int end, int maxWidth) {
        if (start == end) return lastSen(words, start, end, maxWidth);
        int width = 0;
        for (int i = start; i <= end; i++) {
            width += words[i].length();
        }
        int div = (maxWidth - width) / (end - start);
        int rem = (maxWidth - width) % (end - start);
        StringBuilder sb = new StringBuilder();
        char[] divs = new char[div];
        Arrays.fill(divs, ' ');
        String empty = String.valueOf(divs);
        for (int i = 0; i < rem; i++) {
            sb.append(words[start + i]);
            sb.append(empty);
            sb.append(' ');
        }
        for (int i = rem; i < end - start; i++) {
            sb.append(words[start + i]);
            sb.append(empty);           
        }
        sb.append(words[end]);
        return sb.toString();
    
    }
    private String lastSen(String[] words, int start, int end, int maxWidth) {
        StringBuilder sb = new StringBuilder(maxWidth);
        int index = 0;
        for (int i = start; i <= end; i++) {
            sb.append(words[i]);
            sb.append(' ');
        }
        int len = sb.length();
        if (sb.length() > maxWidth) sb.deleteCharAt(len - 1);
        for (int i = len; i < maxWidth; i++) {
            sb.append(' ');
        }
        return sb.toString();
    }
}
