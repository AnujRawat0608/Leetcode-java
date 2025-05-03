class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        // Try to make all values equal to tops[0]
        int result = check(tops[0], tops, bottoms);
        // If it's not possible with tops[0], try with bottoms[0]
        if (result != -1) return result;
        return check(bottoms[0], tops, bottoms);
    }

    private int check(int target, int[] tops, int[] bottoms) {
        int topRotations = 0;     // Rotations to make all tops == target
        int bottomRotations = 0;  // Rotations to make all bottoms == target

        for (int i = 0; i < tops.length; i++) {
            // If neither top nor bottom has the target value at i, not possible
            if (tops[i] != target && bottoms[i] != target) {
                return -1;
            }
            // If top doesn't have the target, we need to rotate
            else if (tops[i] != target) {
                topRotations++;
            }
            // If bottom doesn't have the target, we need to rotate
            else if (bottoms[i] != target) {
                bottomRotations++;
            }
        }

        // Return the minimum rotations needed to make all elements equal to target
        return Math.min(topRotations, bottomRotations);
    }
}
