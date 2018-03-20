class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int length = s.length();
        //if(length == 0) return 0;
        int max = 0;
        int last = 0;
        //put value as key, index as value in the map
        for(int i = 0; i < length; i++){
            if(map.containsKey(s.charAt(i))){
                last = Math.max(map.get(s.charAt(i))+1,last);
            }
            map.put(s.charAt(i),i);
            max = Math.max(max, i-last + 1);           
        }    
        return max;
        /*
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int length = s.length();
        int max = 0;
        int first = 0;
        //put value as key, index as value in the map
        for(int i = 0; i < length; i++){
            if(map.containsKey(s.charAt(i))){
                first = map.get(s.charAt(i));
                //System.out.println(first);
                if(s.charAt(i-1) == s.charAt(i))map.clear();
                while(map.containsValue(first)){map.remove(s.charAt(first--));}
            }
            //System.out.println(map.size());
            map.put(s.charAt(i),i);
            //System.out.println(s.charAt(i));
            //System.out.println(map.size());
            //System.out.println("****");
            if(max < map.size())max = map.size();
            if(max > 94)return max;
            
        }
        
        return max;
        */
    }
}
