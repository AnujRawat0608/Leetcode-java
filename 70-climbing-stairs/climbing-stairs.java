class Solution {
    public int climbStairs(int n) {
        int distinctWays = 0;

        if(n ==0)return 0;
        if(n == 1)return 1;
        if(n == 2)return 2;

        int onestep = 2;
        int twostep = 1;
        int all = 0;

        for(int i=2; i<n; i++){
            all = onestep + twostep;
            twostep = onestep;
            onestep = all;
        }
return all;


    }
}