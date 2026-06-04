class Solution {
    public int totalWaviness(int num1, int num2) {
        int waviness = 0;
        for(int num = num1; num <= num2; num++){
            String s = String.valueOf(num);

            for(int i=1; i<s.length()-1; i++){
                char left = s.charAt(i-1);
                char right = s.charAt(i+1);
                char curr = s.charAt(i);

                if((curr > left && curr > right) || (curr < left && curr < right)){
                    waviness ++;
                }
            }
        }
        return waviness;
    }
}