class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder answer = new StringBuilder();

        for (String word : words) {
            int totalWeight = 0;

            // Calculate weight of current word
            for (char ch : word.toCharArray()) {
                int alphabetIndex = ch - 'a';
                totalWeight += weights[alphabetIndex];
            }

            // Find mapped character
            int remainder = totalWeight % 26;
            char mappedCharacter = (char) ('z' - remainder);

            answer.append(mappedCharacter);
        }

        return answer.toString();
    }
}