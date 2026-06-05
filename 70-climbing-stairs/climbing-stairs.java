class Solution {
    int[] memo;
    public int climbStairs(int n) {
        memo = new int[n+2];
        Arrays.fill(memo,-1);
        return solve(n);

    }
    public int solve(int n){
        if(n == 1)return 1;
        if(n == 2)return 2;
        if(memo[n] != -1) return memo[n];

        memo[n] = solve(n-1) + solve(n-2);
        return memo[n]; 

    }
}