class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int left = 0; 
        int right = n - 1;
        int maxAre = 0;

        while(left < right){
            int h = Math.min(height[left], height[right]);
            int w = right - left;
            int currArea = h * w;

            maxAre = Math.max(maxAre,currArea);

            if(height[left] < height[right]){
                left ++;
            }else{
                right --;
            }
        }
        return maxAre;
        
    }
}