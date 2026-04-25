class Solution {
    int[] memo = new int[20];

    public int numTrees(int n) {
        int count = 0;


        if(n == 0 || n==1)return 1;
        if(memo[n] != 0)return memo[n];
        for(int root = 1; root <= n; root++){
            int left = numTrees(root-1);
            int right = numTrees(n - root);
            count += left * right;
        }
        memo[n] = count;
        return memo[n];
    }
}