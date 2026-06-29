class Solution {
    public int minimumCost(int[] nums) {

        int n = nums.length;
        
        int firstStart = nums[0];
        int cost = 0;
        int minCost = Integer.MAX_VALUE;

        for(int secondStart = 1; secondStart <=n-2; secondStart++){
            for(int thirdStart= secondStart + 1; thirdStart <=n-1; thirdStart ++){
                cost = nums[0] + nums[secondStart] + nums[thirdStart];
                minCost = Math.min(cost, minCost);

            }
        }
        return minCost;
    }
}