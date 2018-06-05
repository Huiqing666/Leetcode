class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            for(int j = 0; j < nums2.length; j++) {
                if(nums2[j] == nums1[i]){
                    j++;
                    while(j < nums2.length && nums2[j] <= nums1[i]){
                        j++;
                    }
                    res[i] = j == nums2.length ? -1 : nums2[j];
                    break;
                }
            }
        }
        return res;
         
    }
}
