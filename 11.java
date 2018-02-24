class Solution {
    public int maxArea(int[] height) {
        int len = height.length;
        int max = 0;
        int temp = 0;
        int right = len - 1;
        int left = 0;
        while(left < right){
            temp = Math.min(height[right], height[left]) * (right - left);
            //System.out.println(height[right]);
            if(temp > max)max = temp;
            if(height[left] > height[right]){
                right--;
            }else{
                left++;
            }
        }
        /*
        for(int i = 0; i < len; i++){
            for(int j = i+1; j < len; j++){
                temp = Math.min(height[j], height[i]) * (j - i);
                if(temp > max)max = temp;
            }
        }
        */
        return max;
    }
}
