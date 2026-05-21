class Solution {
    int[] dp = new int[46];
    public int solve(int n){
        if(n == 0){
            return 1;
        }
        if(n < 0){
            return 0;
        }
        if(dp[n] != 0){
            return dp[n];
        }
        int oneStep = solve(n-1);
        int twostep = solve(n-2);

        dp[n] = oneStep + twostep;
        return dp[n];

        }
    
    public int climbStairs(int n) {
        return solve(n);
    }
}
