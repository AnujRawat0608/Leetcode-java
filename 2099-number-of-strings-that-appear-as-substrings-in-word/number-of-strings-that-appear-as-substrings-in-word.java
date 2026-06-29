class Solution {
    public int numOfStrings(String[] patterns, String word) {

        int count = 0;

        for (String pattern : patterns) {

            if (isSubstring(pattern, word)) {
                count++;
            }

        }

        return count;
    }

    private boolean isSubstring(String pattern, String word) {

        int m = pattern.length();
        int n = word.length();

        for (int i = 0; i <= n - m; i++) {

            int j = 0;

            while (j < m && word.charAt(i + j) == pattern.charAt(j)) {
                j++;
            }

            if (j == m) {
                return true;
            }
        }

        return false;
    }
}