class Solution {
    public int minFlipsMonoIncr(String s) {
        int ones = 0;
        int flips = 0;

        for (char c : s.toCharArray()) {
            if (c == '1') {
                ones++;
            } else { // c == '0'
                flips = Math.min(flips + 1, ones);
            }
        }

        return flips;
    }
}
