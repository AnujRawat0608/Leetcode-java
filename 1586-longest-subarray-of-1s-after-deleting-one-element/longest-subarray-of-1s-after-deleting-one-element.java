class Solution {
    public int longestSubarray(int[] nums) {
        int left = 0;
        int right = 0;
        int zeroCount = 0;
        int maxLength = 0;
        int n = nums.length;
        
        while (right < n) {
            // If the current element is 0, increment zeroCount
            if (nums[right] == 0) {
                zeroCount++;
            }
            
            // If zeroCount exceeds 1, move the left pointer to reduce the window
            while (zeroCount > 1) {
                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++;
            }
            
            // Update maxLength
            // We subtract 1 because we must delete one element
            maxLength = Math.max(maxLength, right - left);
            
            right++;
        }
        
        return maxLength;
    }
    
}