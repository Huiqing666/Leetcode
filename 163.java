class Solution {
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> list = new ArrayList<>();
        //convert them to long first as we will need to do things like ll-1 and lu+1
        long ll = (long)lower;
        long lu = (long)upper;
        //if nums=[], it is missing everything
        if(nums.length==0) {
            helper(ll-1, lu+1, list);
            return list;
        }       
        //imagine we have lower, nums[0], nums[1], ..., nums[n-1], upper
        //always compare with its left neighbour
        for(int i=0; i<nums.length+1; i++)
        {
            //compare nums[0] with lower
            if(i==0) 
                helper(ll-1, nums[i], list);
            //compare upper with nums[n-1]
            else if(i==nums.length)
                helper(nums[nums.length-1], lu+1, list);
            //compare nums[i] with nums[n-1]
            else
                helper(nums[i-1], nums[i], list);            
        }     
        return list;        
    }
    
    //check range [a,b], b>=a for sure
    public void helper(long a, long b, List<String> list)
    {
        //case [2,2] or [2,3]
        if(b<=a+1) return;
        //case [2,4]
        if(b==a+2) 
            list.add((a+1)+"");
        else
            //case [2,5]
            list.add((a+1) + "->" + (b-1));        
    }
}
