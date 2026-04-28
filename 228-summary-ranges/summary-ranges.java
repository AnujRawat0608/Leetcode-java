import java.util.*;

class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        
        if (nums == null || nums.length == 0) return result;

        int start = nums[0];

        for (int i = 1; i <= nums.length; i++) {
            // Check if sequence breaks OR end of array
            if (i == nums.length || nums[i] != nums[i - 1] + 1) {
                int end = nums[i - 1];

                if (start == end) {
                    result.add(String.valueOf(start));
                } else {
                    result.add(start + "->" + end);
                }

                // Start new range
                if (i < nums.length) {
                    start = nums[i];
                }
            }
        }

        return result;
    }
}