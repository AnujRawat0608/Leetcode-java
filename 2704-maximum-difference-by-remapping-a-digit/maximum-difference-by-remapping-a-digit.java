class Solution {
    public int minMaxDifference(int num) {
      String str = Integer.toString(num);

      int MaxNum = Integer.MIN_VALUE;
      int MinNum = Integer.MAX_VALUE;

      for(char i='0'; i<='9'; i++){
        for(char j='0'; j <= '9'; j++){

            String replaced = str.replace(i,j);
            int val = Integer.parseInt(replaced);

            MaxNum = Math.max(MaxNum, val);
            MinNum = Math.min(MinNum, val);
        }
      }
      return MaxNum - MinNum;
    }
}
