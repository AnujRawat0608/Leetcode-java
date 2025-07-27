class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> CharSet = new HashSet<>();
        int maxLength = 0;
        int left = 0;

        for(int right=0 ; right<s.length(); right++){
            while(CharSet.contains(s.charAt(right))){
                CharSet.remove(s.charAt(left));
                    left++;
                
            }
            CharSet.add(s.charAt(right));
            maxLength = Math.max(maxLength, right-left +1); 
        }
      return maxLength;
    }
}