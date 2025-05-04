class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
          Map<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int[] domino : dominoes) {
            // Normalize: [a,b] and [b,a] should map to the same key
            int a = domino[0];
            int b = domino[1];
            int key = Math.min(a, b) * 10 + Math.max(a, b); // e.g. [1,2] and [2,1] → 12

            // If this key was seen before, all previous ones form valid pairs with this one
            count += map.getOrDefault(key, 0);

            // Update the count of this normalized domino
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        return count;
    }
        
    }
