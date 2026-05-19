class Solution {
    int dp[];

    public int solve(int[]nums, int n , int idx){
        if(idx >= n-1){
            return 0;
        }
        if(dp[idx] != -1){
            return dp[idx];
        }
        int minJumps = Integer.MAX_VALUE;
        for(int i =1; i<= nums[idx]; i++){
            int ans = solve(nums, n ,idx +i);
            if(ans != Integer.MAX_VALUE){
                minJumps = Math.min(minJumps, 1+ans);
            }
        }
        dp[idx] = minJumps;
        return dp[idx];
    }
    public int jump(int[] nums) {
        int n = nums.length;
        dp = new int[n];
        Arrays.fill(dp,-1);
        return solve(nums,n,0);
        
    }
}