import java.util.*;

class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] code = {
            ".-","-...","-.-.","-..",".","..-.","--.","....","..",".---",
            "-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-",
            "..-","...-",".--","-..-","-.--","--.."
        };
        
        Map<String, Integer> hash = new HashMap<>();
        
        for (String word : words) {
            StringBuilder sb = new StringBuilder();
            for (char ch : word.toCharArray()) {
                sb.append(code[ch - 'a']);
            }
            hash.put(sb.toString(), hash.getOrDefault(sb.toString(), 0) + 1);
        }
        
        return hash.size();
    }
}