class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int maxWater = 0; 
        int left = 0; 
        int right = n-1;

        while(left < right){
            int h = Math.min(height[left], height[right]);
            int w = right - left ;
            int curarea = h * w;
            maxWater = Math.max(maxWater, curarea);

            if(height[left] < height[right]){
                left++;
            }else{
                right --;
            }
        }
        return maxWater;
    }
}