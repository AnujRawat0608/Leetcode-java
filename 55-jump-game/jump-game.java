class Solution {
    int[] dp;

    public boolean solve(int[] nums, int n, int idx){
        
        if(idx >= n-1){
            return true;
        }
        if(dp[idx] != -1){
            return dp[idx] == 1;
        }
        for(int i=1; i<=nums[idx]; i++){
            if(solve(nums, n, idx + i)){
                dp[idx]=1;//true
            return true;
        }
    }
    dp[idx]=0;//false
    return false;
    }
    public boolean canJump(int[] nums) {
        int n = nums.length;
        dp = new int[n];
        Arrays.fill(dp,-1);
        return solve(nums, n, 0);
        
    }
}