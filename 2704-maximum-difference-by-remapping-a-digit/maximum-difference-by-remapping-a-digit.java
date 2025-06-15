class Solution {
    public int minMaxDifference(int num) {
        String s = String.valueOf(num);
        int maxVal = Integer.MIN_VALUE;
        int minVal = Integer.MAX_VALUE;

        // Try replacing every digit d1 with every digit d2 (0-9)
        for (char d1 = '0'; d1 <= '9'; d1++) {
            for (char d2 = '0'; d2 <= '9'; d2++) {
                String replaced = s.replace(d1, d2);
                int val = Integer.parseInt(replaced);
                maxVal = Math.max(maxVal, val);
                minVal = Math.min(minVal, val);
            }
        }

        return maxVal - minVal;
    }
}
