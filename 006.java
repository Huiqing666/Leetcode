class Solution {
    public String convert(String s, int numRows) {
        if(s.length() < 3) return s;
        if(numRows == 1) return s;
        StringBuilder sb = new StringBuilder();
        char[] pre = s.toCharArray();
        int[] flag = new int[pre.length];
        flag[0] = 1;
        flag[1] = numRows > 1 ? 2 : 1;
        //System.out.println(Arrays.toString(flag));
        for(int i = 2; i < pre.length; i++) {
            if(flag[i - 2] < flag[i - 1] && flag[i - 1] < numRows) {
                flag[i] = flag[i-1]+1;
            }else if(flag[i-1] > 1){
                flag[i] = flag[i-1]-1;
            }else{
                flag[i] = flag[i-1]+1;
            }
            //System.out.println(flag[i]);
        }
        //System.out.println(Arrays.toString(flag));
        for(int i = 1; i <= numRows; i++) {
            for(int j = 0; j < pre.length; j++) {
                if(flag[j] == i) {
                    sb.append(pre[j]);
                }
            }
        }
        
        
        return sb.toString();
    }
}
