class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int countL = 0;
        int countR = 0;
        int countUnderscore = 0;

        for (char ch : moves.toCharArray()) {
            if (ch == 'L') {
                countL++;
            } else if (ch == 'R') {
                countR++;
            } else { 
                countUnderscore++;
            }
        }

        return Math.abs(countL - countR) + countUnderscore;
    }
}