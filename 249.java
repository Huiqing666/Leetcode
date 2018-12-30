class Solution {
    public List<List<String>> groupStrings(String[] strings) {
        Arrays.sort(strings, (a, b) -> (a.length() - b.length()));
        // System.out.println(Arrays.toString(strings));
        List<List<String>> res = new ArrayList<>();
        HashMap<String, List<String>> pattern = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            String pat = helper(strings[i]);
            List<String> temp = pattern.getOrDefault(pat, new ArrayList<>());
            temp.add(strings[i]);
            pattern.put(pat, temp);
        }
        for (String s : pattern.keySet()) {
            res.add(pattern.get(s));
        }
        return res;
        
        
        
    }
    private String helper(String s) {
        StringBuilder sb = new StringBuilder();
        int dis = (int) s.charAt(0) - 'a';
        //System.out.println(dis);
        for (int i = 0; i < s.length(); i++) {
            int num = (int) s.charAt(i) - dis;
            char a =  num < 97 ? (char) (num + 26) : (char) num; 
            sb.append(a);
        }
        //System.out.println(sb.toString());
        return sb.toString();
    }
}
