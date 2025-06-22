class Solution {
    public int minTimeToType(String word) {
       int totalTime = 0;
       char current = 'a';

       for(char c : word.toCharArray()){

        int clockwise = Math.abs(c - current);
        int anticlock = 26 - clockwise;

        int moveTime = Math.min(clockwise, anticlock);
        totalTime += moveTime + 1;

        current =c ; 
       }
       return totalTime;

    }
}