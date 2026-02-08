class Solution {
    int[][] dp;
    int n;
    int INF = (int) 1e9;

    public int minDifficulty(int[] jobDifficulty, int d) {
        n = jobDifficulty.length;

        // Impossible if jobs < days
        if (n < d) return -1;

        dp = new int[n][d + 1];

        // Initialize memo table
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= d; j++) {
                dp[i][j] = -1;
            }
        }

        int result = dfs(0, d, jobDifficulty);
        return result >= INF ? -1 : result;
    }

    private int dfs(int index, int daysLeft, int[] job) {

        // Base case: perfectly used all jobs & days
        if (daysLeft == 0 && index == n) return 0;

        // Invalid cases
        if (daysLeft == 0 || index == n) return INF;
        if (n - index < daysLeft) return INF;

        // Memoized
        if (dp[index][daysLeft] != -1)
            return dp[index][daysLeft];

        int maxToday = 0;
        int minTotal = INF;

        // Try all possible splits for today
        for (int i = index; i < n; i++) {
            maxToday = Math.max(maxToday, job[i]);
            int next = dfs(i + 1, daysLeft - 1, job);
            minTotal = Math.min(minTotal, maxToday + next);
        }

        return dp[index][daysLeft] = minTotal;
    }
}
