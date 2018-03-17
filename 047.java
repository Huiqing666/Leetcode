class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        //since it contains duplicates, we need to track each element if it is used
        backtrack(list, new ArrayList<>(), nums, new boolean[nums.length]);
        return list;
    }
    private void backtrack(List<List<Integer>> list, List<Integer> templist, int[] nums, boolean[] used){
        if(templist.size() == nums.length){
            list.add(new ArrayList<>(templist));
            
        }else{
            for(int i = 0; i < nums.length; i++){
                if(used[i] || i > 0 && nums[i] == nums[i-1] && !used[i - 1]) continue;
                used[i] = true; 
                templist.add(nums[i]);
                backtrack(list, templist, nums, used);
                used[i] = false; 
                templist.remove(templist.size() - 1);
            }
        }
        

    }
    
}
