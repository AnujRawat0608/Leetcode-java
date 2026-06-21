class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int n = costs.length;
        int bought = 0;

        for(int i=0; i<n; i++){
            if(coins > 0 && coins >= costs[i]){
                bought ++;
                coins -= costs[i] ;
            }else{
                break;
            }

        }
        return bought;
    }
}
/*

costs = [1,1,2,3,4]
coins = 7 
bought ++;
coins =6
b =1

costs[1,2,3,4]
coins =6
bought ++;
coins =5 
b =2

costs[2,3,4]
coins = 5
bought++;
coins=4
b =3;

cost[3,4]
coins = 4


*/