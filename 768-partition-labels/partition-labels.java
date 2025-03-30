class Solution {
    public List<Integer> partitionLabels(String s) {
          List<Integer> result = new ArrayList<>();
        int[] lastIndex = new int[26]; // Stores the last index of each character
        
        // Step 1: Record the last occurrence of each character
        for (int i = 0; i < s.length(); i++) {
            lastIndex[s.charAt(i) - 'a'] = i;
        }
        
        // Step 2: Iterate and determine partitions
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            end = Math.max(end, lastIndex[s.charAt(i) - 'a']); // Update the furthest end
            if (i == end) { // If we reach the end of a partition
                result.add(end - start + 1);
                start = i + 1; // Start new partition
            }
        }
        
        return result;
    }
}
        