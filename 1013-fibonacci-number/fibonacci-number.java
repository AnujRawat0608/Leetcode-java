class Solution {
    public int fib(int n) {
        if(n == 0)return 0;
        if(n == 1)return 1;
        
        return fib(n-1) + fib(n-2);
    }
}
/*

n = 2
F(2) = F(1) + f(0)
f(2) = 1+0
 */