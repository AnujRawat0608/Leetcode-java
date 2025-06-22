class Solution {
    public int minTimeToType(String word) {
        int totalTime = 0;
        char current = 'a';  // starting point

        for (char c : word.toCharArray()) {
            // distance in clockwise and counterclockwise directions
            int clockwise = Math.abs(c - current);
            int counterClockwise = 26 - clockwise;

            int moveTime = Math.min(clockwise, counterClockwise);
            totalTime += moveTime + 1; // +1 for typing

            current = c; // update current pointer
        }

        return totalTime;
        
    }
}