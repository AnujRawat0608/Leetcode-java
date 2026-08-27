class Solution {
    public String lexGreaterPermutation(String s, String target) {
        int n = s.length();
        int[] count = new int[26];

        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        StringBuilder ans = new StringBuilder();

        // Try to match target as a prefix, greedily, using available letters
        for (int i = 0; i < n; i++) {
            int t = target.charAt(i) - 'a';

            if (count[t] > 0) {
                ans.append(target.charAt(i));
                count[t]--;
            } else {
                int greater = findGreater(count, t);
                if (greater != -1) {
                    ans.append((char) ('a' + greater));
                    count[greater]--;
                    appendRemaining(ans, count);
                    return ans.toString();
                }
                break; // no way to exceed target at this position — go backtrack
            }
        }

        // Backtrack: either we matched target exactly, or got stuck partway through
        for (int i = ans.length() - 1; i >= 0; i--) {
            int current = ans.charAt(i) - 'a';
            count[current]++; // put the letter back into the pool

            int targetChar = target.charAt(i) - 'a';
            int greater = findGreater(count, targetChar);

            if (greater != -1) {
                ans.setCharAt(i, (char) ('a' + greater));
                count[greater]--;
                ans.setLength(i + 1);
                appendRemaining(ans, count);
                return ans.toString();
            }
        }

        return ""; // no permutation of s's letters is greater than target
    }

    private int findGreater(int[] count, int targetChar) {
        for (int c = targetChar + 1; c < 26; c++) {
            if (count[c] > 0) {
                return c;
            }
        }
        return -1;
    }

    private void appendRemaining(StringBuilder ans, int[] count) {
        for (int c = 0; c < 26; c++) {
            while (count[c] > 0) {
                ans.append((char) ('a' + c));
                count[c]--;
            }
        }
    }
}