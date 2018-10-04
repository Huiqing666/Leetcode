class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String str : strs) {
            String s = sort(str);
            if(!map.containsKey(s)) {
                List<String> li = new ArrayList<>();
                li.add(str);
                map.put(s, li);
            }else{
                List<String> li = map.get(s);
                li.add(str);
                map.put(s, li);
            }
            
        }
        List<List<String>> res = new ArrayList<>();
        for(List<String> list : map.values()) {
            res.add(list);
        }
        return res;
         
    }
    private String sort(String s) {
        char[] c = s.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }
}
