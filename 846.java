class Solution {
    public boolean isNStraightHand(int[] hand, int W) {
        //if(W * W != hand.length) return false;
        if(hand.length % W != 0) return false;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i : hand){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int[] keys = new int[map.size()];
        int index = 0;
        for(int i : map.keySet()){
            keys[index] = i;
            index++;
        }
        
        //System.out.println(Arrays.toString(keys));
        Arrays.sort(keys);
        for(int i = 0; i < keys.length; i++) {
            int count = map.get(keys[i]);
            if(count == 0) continue;
            for(int j = 0; j < W; j++){
                if(map.get(keys[i] + j) == null) return false;
                int newcount = map.get(keys[i]+j) - count;
                if(newcount < 0) return false;
                map.put(keys[i]+j, newcount);
            
            }
            
        }
        return true;
            
        
        
    }
}
