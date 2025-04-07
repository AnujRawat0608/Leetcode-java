class Solution {
    private int sumOf(int[] nums)
    {
        int sum = 0;
        for(int num:nums)
        sum += num;
        return sum;
    }
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int sum = sumOf(nums);
        if((sum & 1) == 1) return false;
        sum = sum/2;
        boolean[][] dp = new boolean[n][sum+1];
        // for(int[] row:dp) Arrays.fill(row,-1);
        for(int i=0;i<n;i++) dp[i][0] = true;
        if(nums[0]<=sum) dp[0][nums[0]] = true;
        for(int i=1;i<n;i++)
        {
            for(int k=1;k<=sum;k++)
            {
                boolean dont = dp[i-1][k];
                boolean pick = false;
                if(nums[i]<=k) pick = dp[i-1][k-nums[i]];
                dp[i][k] = (pick || dont);
            }
        }
        return dp[n-1][sum];
    }
}  
