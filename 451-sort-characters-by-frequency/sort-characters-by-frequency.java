class Solution {
    public String frequencySort(String s) {
          // Step 1: Count frequency of each character
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        // Step 2: Use a max-heap (PriorityQueue) to sort characters by frequency
        PriorityQueue<Character> pq = new PriorityQueue<>((a, b) -> freqMap.get(b) - freqMap.get(a));
        pq.addAll(freqMap.keySet());

        // Step 3: Build the result string
        StringBuilder sb = new StringBuilder();
        while (!pq.isEmpty()) {
            char current = pq.poll();
            int freq = freqMap.get(current);
            for (int i = 0; i < freq; i++) {
                sb.append(current);
            }
        }

        return sb.toString();
    }
}