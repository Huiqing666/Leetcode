class Solution {
    public List<List<Integer>> largeGroupPositions(String S) {
        List<List<Integer>> res = new ArrayList<>();
        char[] sequence = S.toCharArray();
        int preindex = 0;
        int i = 0;
        for(; i < sequence.length; i++) {
            if(sequence[i] == sequence[preindex]){
                continue;
            }else{
                //System.out.println(sequence[i]); 
                if(i - preindex >= 3){
                    List<Integer> tempres = new ArrayList<>();
                    tempres.add(preindex);
                    tempres.add(i-1);
                    res.add(tempres);
                }
                preindex = i;
            }
        }
        if(i - preindex >= 3){
            List<Integer> tempres = new ArrayList<>();
            tempres.add(preindex);
            tempres.add(i-1);
            res.add(tempres);
        }
        return res;
        
    }
}
