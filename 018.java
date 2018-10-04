class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target1) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            int a = nums[i];
            if(i > 0 && nums[i] == nums[i-1]) continue;
            for(int j = i+1; j < nums.length; j++) {
                int b = nums[j];
                if(j > i+1 && nums[j] == nums[j-1]) continue;
                //two pointers
                int target = target1 - a - b;
                int p = j+1, q = nums.length - 1;
                while(p < q) {
                    if(p > j+1 && nums[p] == nums[p-1]) {
                        p++;
                        continue;
                    };
                    if(nums[p] + nums[q] == target) {
                        List<Integer> temp = new ArrayList();
                        temp.add(a);
                        temp.add(b);
                        temp.add(nums[p]);
                        temp.add(nums[q]);
                        res.add(temp);
                        p++;
                        q--;
                    }else if(nums[p] + nums[q] > target){
                        q--;
                    }else{
                        p++;
                    }
                }
            }
        }
        return res;
        
    }
}
