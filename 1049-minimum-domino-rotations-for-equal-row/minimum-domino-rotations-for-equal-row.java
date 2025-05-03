class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int result = check(tops[0], tops, bottoms); // Try making tops[0] the target
        if (result != -1) return result;
        return check(bottoms[0], tops, bottoms); // If failed, try with bottoms[0]
    }

    private int check(int target, int[] tops, int[] bottoms) {
        int rotateTop = 0;
        int rotateBottom = 0;

        for (int i = 0; i < tops.length; i++) {
            if (tops[i] != target && bottoms[i] != target) {
                return -1; // Not possible
            } else if (tops[i] != target) {
                rotateTop++; // Need to rotate top to make it equal to target
            } else if (bottoms[i] != target) {
                rotateBottom++; // Need to rotate bottom to make it equal to target
            }
        }

        return Math.min(rotateTop, rotateBottom);
    }
}
