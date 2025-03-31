class Solution {
    public long putMarbles(int[] weights, int k) {
           if (k == 1) return 0; // Only one bag, no difference.

        int n = weights.length;
        long[] pairSum = new long[n - 1];

        // Compute the sum of adjacent elements
        for (int i = 0; i < n - 1; i++) {
            pairSum[i] = weights[i] + weights[i + 1];
        }

        // Sort pair sums
        Arrays.sort(pairSum);

        long minSum = 0, maxSum = 0;
        for (int i = 0; i < k - 1; i++) {
            minSum += pairSum[i];                       // Sum of smallest k-1 pairs
            maxSum += pairSum[n - 2 - i];               // Sum of largest k-1 pairs
        }

        return maxSum - minSum;
    }

}