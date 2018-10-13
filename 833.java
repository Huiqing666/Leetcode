class Solution {
    public String findReplaceString(String S, int[] indexes, String[] sources, String[] targets) {
        int t_index = 0;
        char[] ss = S.toCharArray();
        int[][] a = new int[indexes.length][2];
        for(int i  = 0; i < indexes.length; i++) {
            a[i][0] = indexes[i];
            a[i][1] = i;
        }
        Arrays.sort(a, (b, c) ->(b[0]- c[0]));
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < ss.length; i++){
            boolean same = false;
            int j = 0;
            if(t_index < indexes.length && a[t_index][0] == i){
                //compare
                int s_index = a[t_index][1];
                same = sources[s_index].equals(S.substring(i, i+sources[s_index].length()));
                if(same){
                    sb.append(targets[s_index]);
                    i = i + sources[s_index].length() - 1;
                }
                t_index++;
            }
            if(!same) sb.append(ss[i]);  
            
            
        }
        return sb.toString();
    }
}
