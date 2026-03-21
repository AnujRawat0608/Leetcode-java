class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        int longest = 1;
        int streak = 1;

        Arrays.sort(nums);

        if(n == 0)return 0;

        for(int i=1; i<n; i++){
            if(nums[i] == nums[i-1]){
                continue;
            }else if(nums[i] == nums[i-1] + 1){
                streak ++;
            }else{ 
                streak = 1;
            }
            longest = Math.max(streak, longest);
        }
         return longest;
        
    }
   

}