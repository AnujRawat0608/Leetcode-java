class Solution {
    public int lengthOfLongestSubstring(String s) {

        Set<Character> longsubstring = new HashSet<>();
        int length = 0;
        int left = 0;

        for(int right = 0; right < s.length(); right++){
            while(longsubstring.contains(s.charAt(right))){
                longsubstring.remove(s.charAt(left));
                left++;
            }
            longsubstring.add(s.charAt(right));
            length = Math.max(length,right-left+1);


        }
        return length;



        
    }
}