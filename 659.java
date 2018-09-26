class Solution {
    public boolean isPossible(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i =  0; i < nums.length; i++) {
            boolean append = false;
            int j = list.size() - 1;
            for(; j >= 0; j--) {
                List<Integer> temp = list.get(j);
                if(temp.get(temp.size() - 1) + 1 == nums[i]) {
                    list.get(j).add(nums[i]);
                    append = true;
                    break;
                }
            }
            if(j < 0) {
                List<Integer> one = new ArrayList<>();
                one.add(nums[i]);
                list.add(one);
            }
        }
        for(int i = list.size() - 1; i >= 0; i--) {
            //System.out.println(list.get(i).size());
            if(list.get(i).size() < 3) return false;
        }
        return true;
        
    }
}
////very slow approach
