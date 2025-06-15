class Solution {
    public int maxDiff(int num) {
        String s = String.valueOf(num);

        // Get maximum value by replacing some digit with '9'
        int maxVal = getMaxValue(s);

        // Get minimum value by replacing some digit with '0' or '1'
        int minVal = getMinValue(s);

        return maxVal - minVal;
    }

    private int getMaxValue(String s) {
        for (char c : s.toCharArray()) {
            if (c != '9') {
                String replaced = s.replace(c, '9');
                return Integer.parseInt(replaced);
            }
        }
        return Integer.parseInt(s); // All digits are 9
    }

    private int getMinValue(String s) {
        char firstDigit = s.charAt(0);

        if (firstDigit != '1') {
            // Replace first digit with '1' to avoid leading zero
            String replaced = s.replace(firstDigit, '1');
            return Integer.parseInt(replaced);
        } else {
            // Replace any digit (except the first) with '0'
            for (int i = 1; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c != '0' && c != '1') {
                    String replaced = s.replace(c, '0');
                    return Integer.parseInt(replaced);
                }
            }
        }

        return Integer.parseInt(s); // No useful replacements
    }
}
