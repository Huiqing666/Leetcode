class Solution {
    int[] count;
    public List<Integer> countSmaller(int[] nums) {
        List<Integer> list = new ArrayList<>();
        
        count = new int[nums.length];
        int[] indices = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            indices[i] = i;
        }
        mergesort(nums, 0, nums.length - 1, indices);
        
        for (int i = 0; i < nums.length; i++) {
            list.add(count[i]);
        }
        return list;
    }
    private void mergesort(int[] nums, int lo, int hi, int[] indices) {
        if (lo >= hi) return;
        int mid = (lo + hi) / 2;
        mergesort(nums, lo, mid, indices);
        mergesort(nums, mid + 1, hi, indices);
        
        merge(nums, lo, hi, indices);
    } 
    private void merge(int[] nums, int lo, int hi, int[] indices) {
        // from lo to mid, mid + 1 to hi : already sorted
        int mid = (lo + hi) / 2;
        
        int left_start = lo, right_start = mid + 1;
        int right_count = 0;
        int[] new_indices = new int[hi - lo + 1];
        
        int sort_index = 0;
        while (left_start <= mid && right_start <= hi) {
            
            if (nums[indices[left_start]] > nums[indices[right_start]]) {
                new_indices[sort_index] = indices[right_start];
                right_count++;
                right_start++;
            }
            else {
                new_indices[sort_index] = indices[left_start];
                count[indices[left_start]] += right_count;
                left_start++;
            }
            sort_index++;
        }
        while (left_start <= mid) {
            new_indices[sort_index] = indices[left_start];
            count[indices[left_start]] += right_count;
            left_start++;
            sort_index++;
        }
        while (right_start <= hi) {
            new_indices[sort_index] = indices[right_start];
            sort_index++;
            right_start++;
        }
        for(int i = lo; i <= hi; i++){
		    indices[i] = new_indices[i - lo];
	    }
    }
}
