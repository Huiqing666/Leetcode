class Solution {
    public int[] shortestToChar(String S, char C) {
        int[] res = new int[S.length()];
        Arrays.fill(res, 10000);
        for(int i = 0; i < res.length; i++) {
            if(S.charAt(i) == C){
                //update distance
                int j = i;
                int dis = 0;
                while(j >= 0){
                    res[j] = dis;
                    dis++;
                    j--;
                    if(j >= 0 && dis >= res[j])break;
                }
            }
        }
        for(int i = res.length - 1; i >= 0; i--) {
            if(S.charAt(i) == C){
                //update distance
                int j = i;
                int dis = 0;
                while(j < res.length){
                    res[j] = dis;
                    dis++;
                    j++;
                    if(j < res.length && dis >= res[j])break;
                }
            }
        }
        return res;
    }
}
