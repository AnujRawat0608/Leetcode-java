class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;

        boolean[] t = new boolean[n];
        t[0] = true;

        for(int i = 1; i <n ; i++){
            for(int j = i -1; j >= 0; j--){
                if(j + nums[j] >= i && t[j]){
                    t[i] = true;
                    break;
                }
            }
        }
        return t[n-1];
    }
}