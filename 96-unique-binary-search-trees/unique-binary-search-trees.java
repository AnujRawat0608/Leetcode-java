class Solution {
    int[] memo;
    
    public int numTrees(int n) {
        memo = new int[n+1];
        return solve(n);
    }
    private int solve(int n){

        if(n==0 || n ==1)return 1;

        if(memo[n] != 0) return memo[n];

        int count = 0;
         for(int root = 1; root<=n; root++){
            int left = solve(root-1);
            int right = solve(n- root);
            count += left * right; 
         }
         memo[n] = count;
         return memo[n];
        
    }
}