class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        if(nums.length == 0) return list;
        int count1 = 0, count2 = 0;
        int number1 = nums[0], number2 = nums[0], len = nums.length;
        for (int i = 0; i < len; i++) {
            if (nums[i] == number1) {
                count1++;
            }
            else if (nums[i] == number2) {
                count2++;
            }
            else if (count1 == 0) {
                number1 = nums[i];
                count1++;
            }
            else if (count2 == 0) {
                number2 = nums[i];
                count2++;
            }
            else {
                count1--;
                count2--;
            }
            //System.out.println(number1 + " " + number2);
        }
        count1 = 0;
        count2 = 0;
        
        for (int i = 0; i < len; i++) {
            if (nums[i] == number1) {
                count1++;
            }
            else if(nums[i] == number2){
                count2++;
            }
        }
        
        if(count1 > (len/3)) list.add(number1);
        if(count2 > (len/3) && number1 != number2) list.add(number2);
        return list;
    }
}
