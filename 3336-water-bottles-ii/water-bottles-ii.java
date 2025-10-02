class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int emptyBottles = 0;
        int drunkBottles = 0;

        // Drink all initial bottles
        drunkBottles += numBottles;
        emptyBottles += numBottles;

        // Try exchanging as long as possible
        while (emptyBottles >= numExchange) {
            // Exchange empty bottles for 1 full bottle
            emptyBottles -= numExchange;
            numExchange++;

            // Drink the new full bottle
            drunkBottles++;
            emptyBottles++;
        }

        return drunkBottles;
    }
}
