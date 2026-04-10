class Solution {
    public int climbStairs(int n) {
        if (n == 1) return 1;
        
        // create a table to store answers
        int[] dp = new int[n + 1];
        
        // fill base cases
        dp[1] = 1;
        dp[2] = 2;
        
        // fill rest bottom-up
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        
        return dp[n];
    }
}