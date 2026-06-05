class Solution {
    int[] memo;
    public int fib(int n) {
        memo = new int[n+2];
        Arrays.fill(memo, -1);
        return solve(n);
        }
        private int solve(int n){
            if(n ==0 || n == 1)return n;
            if(memo[n] != -1)return memo[n];

        memo[n] = solve(n-1) + solve(n-2);
        return memo[n];
    }
}
/*

n = 2
F(2) = F(1) + f(0)
f(2) = 1+0
 */