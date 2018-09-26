class Solution {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        int start = 0, count = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        char[] c = s.toCharArray();
        for(int i = 0; i < c.length; i++) {
            if(map.size() < 2 || map.containsKey(c[i])) {
                map.put(c[i], i);
            }else{
                start = c.length;
                char temp = c[i];
                for(Character cc : map.keySet()){
                    if(start > map.get(cc)){
                        start = map.get(cc);
                        temp = cc;
                    }   
                }
                map.remove(temp);
                start++;
                map.put(c[i], i);
            }
            //System.out.println("start" + start +"  "+ (i - start + 1));
            count = Math.max(i - start + 1, count);
        }
        return count;
        
        
        
    }
}
