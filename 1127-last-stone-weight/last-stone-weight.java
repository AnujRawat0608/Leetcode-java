import java.util.Arrays;

class Solution {
    public int lastStoneWeight(int[] stones) {
        int n = stones.length;

        while (true) {
            Arrays.sort(stones); // Sort the array each round
            int i = n - 1;

            // ✅ Fix: Check if only one stone is left
            if (i == 0 || stones[i - 1] == 0) {
                return stones[i];
            }

            // Smash the two largest stones
            stones[i - 1] = stones[i] - stones[i - 1];
            stones[i] = 0; // Remove the largest stone
        }
    }
}
