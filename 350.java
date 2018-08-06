class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int j = 0;
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = 0; i < len1; i++) {
            if(j < len2 && nums1[i] == nums2[j]){
                j++;
                res.add(nums1[i]);
            }else if(j < len2 && nums1[i] > nums2[j]) {
                j++;
                i--;
            }
        }
        int[] arr = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
           arr[i] = res.get(i);
        }
        return arr;
        
    }
}
