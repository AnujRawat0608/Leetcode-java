class Solution {
    int n ;
    int[] dp;
    public int solve(int[] arr ,int d, int i){
        int result = 1;
        if(dp[i] != 0){
            return dp[i];
        }
        for(int j = i-1; j>= Math.max(0,i-d); j--){
            if(arr[j] >= arr[i])break;
            result = Math.max(result,1+solve(arr,d,j));
        }
        for(int j=i+1; j<=Math.min(n-1,i+d); j++){
            if(arr[j] >= arr[i])break;
            result = Math.max(result,1+solve(arr,d,j));
        }
        dp[i] = result;
        return dp[i];
    }
    public int maxJumps(int[] arr, int d) {
        n = arr.length;
        dp = new int[n];
        int maxJump =1;
        for(int i=0; i<n; i++){
            maxJump = Math.max(maxJump, solve(arr,d,i));
        }
        return maxJump;
        
    }
}