class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>();
        if(rowIndex == 0) {
            res.add(1);
            return res;
        }
        List<Integer> prev = new ArrayList<>();
        prev.add(1);
        for (int i = 1; i <= rowIndex; i++) {
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            for(int j = 0; j < prev.size() - 1; j++){
                temp.add(prev.get(j) + prev.get(j + 1));
            }
            temp.add(1);
            prev = temp;
            
        }
        return prev;
        
    }
}
