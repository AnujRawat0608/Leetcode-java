class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int longest = 1;
        int currentstreak = 1;

        if(nums.length == 0){
            return 0;
        }

        for(int i=1; i<nums.length; i++){
            if(nums[i] == nums[i-1]){
                continue;
            }
            if(nums[i] == nums[i-1]+1){
                currentstreak ++;
            }else{
                currentstreak = 1;
            }
            longest = Math.max(longest, currentstreak);
        }
        return longest;
        
    }
}