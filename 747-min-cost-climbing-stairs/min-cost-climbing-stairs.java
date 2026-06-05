class Solution {
    int n;
    int[] memo;

    public int minCostClimbingStairs(int[] cost) {
        n = cost.length;
        memo = new int[n + 1];
        Arrays.fill(memo, -1);
        return Math.min(solve(cost, 0), solve(cost, 1)); // ✅ start from 0 or 1
    }

    int solve(int[] cost, int idx) {
        if (idx >= n) return 0;          // ✅ reached top, no more cost

        if (memo[idx] != -1) return memo[idx]; // ✅ already computed

        int a = cost[idx] + solve(cost, idx + 1); // take 1 step
        int b = cost[idx] + solve(cost, idx + 2); // take 2 steps

        memo[idx] = Math.min(a, b);      // ✅ store minimum
        return memo[idx];
    }
}