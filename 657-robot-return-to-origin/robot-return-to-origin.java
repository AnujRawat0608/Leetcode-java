class Solution {
    public boolean judgeCircle(String moves) {
        int up = 0, down=0, right=0, left = 0;

        for(char c : moves.toCharArray()){
            if(c == 'U')up++;
            if(c == 'D')down++;
            if(c == 'R')right++;
            if(c == 'L')left++;

        }
        return up == down && right == left;     
    }
}