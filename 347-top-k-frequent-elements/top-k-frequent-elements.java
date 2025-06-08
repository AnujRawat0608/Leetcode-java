import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Step 1: Count frequencies using a map
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Sort the map entries by value (frequency) in descending order
        List<Map.Entry<Integer, Integer>> sortedList = new ArrayList<>(freqMap.entrySet());
        sortedList.sort((a, b) -> b.getValue() - a.getValue());

        // Step 3: Take the top k elements
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = sortedList.get(i).getKey();
        }

        return result;
    }
}
