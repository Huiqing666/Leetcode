class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('M', 1000);
        map.put('D', 500);
        map.put('C', 100);
        map.put('L', 50);
        map.put('X', 10);
        map.put('V', 5);
        map.put('I', 1);
        int res = 0;
        for (int i = 1; i < s.length(); i++) {
            char a = s.charAt(i-1);
            char b = s.charAt(i);

            if (map.get(a) < map.get(b)) {
                res += map.get(b) - map.get(a);
                i++;
            }
            else {
                res += map.get(a);
            }
            //System.out.println(res);

        }
        int len = s.length();
        if (len >= 2 && map.get(s.charAt(len - 2)) >= map.get(s.charAt(len - 1)) || len == 1) {
            res += map.get(s.charAt(len - 1));
        }
        
        return res;
        
    }
}
