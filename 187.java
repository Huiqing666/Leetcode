class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> seen = new HashSet<>(), repeated = new HashSet();
        if (s.length() < 10) return new ArrayList<>();
        StringBuilder sb = new StringBuilder(s.substring(0, 10));
        seen.add(sb.toString());
        for (int i = 10; i < s.length(); i++) {
            sb.deleteCharAt(0);
            sb.append(s.charAt(i));
            String ten = sb.toString();
            // System.out.println(ten);
            if (!seen.add(ten))
                repeated.add(ten);
        }
        return new ArrayList(repeated);
        
    }
}
