public class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;

        // Check every number from 0 to n
        for (int i = 0; i <= n; i++) {
             boolean found = false;

            // Look for i in the array
            for (int j = 0; j < n; j++) {
                if (nums[j] == i) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                return i;
            }
        }

        return -1; // just in case
    }
}
