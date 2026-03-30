class Solution {
    public boolean checkStrings(String s1, String s2) {
   int n = s1.length();

        int[] even = new int[26];
        int[] odd = new int[26];

        // Count frequencies from s1
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                even[s1.charAt(i) - 'a']++;
            } else {
                odd[s1.charAt(i) - 'a']++;
            }
        }

        // Subtract frequencies using s2
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                even[s2.charAt(i) - 'a']--;
            } else {
                odd[s2.charAt(i) - 'a']--;
            }
        }

        // Check if all counts are zero
        for (int i = 0; i < 26; i++) {
            if (even[i] != 0 || odd[i] != 0) {
                return false;
            }
        }

        return true;
    }
}