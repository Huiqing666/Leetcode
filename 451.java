class Solution {
    public String frequencySort(String s) {
        int[][] res = new int[128][2];
        for(int i = 0; i < 128; i++){
            res[i][0] = i;
        }
        for(int i = 0; i < s.length(); i++){
            //System.out.println((char)114);
            res[(int)s.charAt(i)][1]++;
        }
        
        StringBuilder sb = new StringBuilder();
        Arrays.sort(res, (a, b) -> {
                return a[1] - b[1];
            }
        );
        for(int i = 127; i >= 0; i--){
            while(res[i][1]>0){
                sb.append((char)res[i][0]);
                res[i][1]--;
            }
        }
        return sb.toString();
    }
}
