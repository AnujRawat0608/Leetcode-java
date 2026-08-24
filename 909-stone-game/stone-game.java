class Solution {
    public boolean stoneGame(int[] piles) {
        int n = piles.length;

        int[][] dp = new int[n][n];

        // Base case:
        // If there is only one pile,
        // current player takes it.
        for (int i = 0; i < n; i++) {
            dp[i][i] = piles[i];
        }

        // Consider subarrays of increasing length
        for (int len = 2; len <= n; len++) {

            for (int i = 0; i + len - 1 < n; i++) {

                int j = i + len - 1;

                // Take the left pile
                int takeLeft = piles[i] - dp[i + 1][j];

                // Take the right pile
                int takeRight = piles[j] - dp[i][j - 1];

                // Choose the better option
                dp[i][j] = Math.max(takeLeft, takeRight);
            }
        }

        // Positive difference means Alice wins
        return dp[0][n - 1] > 0;
    }
}

/*

Alice 
Bob

even number of piles 
to end with most stones each pile has odd number of stones

Alice is first 
Player can take pile either from start of from end 
Player with most stone wins 

both players play optimally

return true if alice wins
return false if bob wins

*/