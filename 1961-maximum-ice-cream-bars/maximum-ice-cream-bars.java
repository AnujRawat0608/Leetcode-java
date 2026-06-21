class Solution {
    public int maxIceCream(int[] costs, int coins) {

        int max = 0;

        for (int cost : costs) {
            max = Math.max(max, cost);
        }

        int[] freq = new int[max + 1];

        for (int cost : costs) {
            freq[cost]++;
        }

        int bought = 0;

        for (int cost = 1; cost <= max; cost++) {

            while (freq[cost] > 0 && coins >= cost) {
                coins -= cost;
                bought++;
                freq[cost]--;
            }
        }

        return bought;
    }
}