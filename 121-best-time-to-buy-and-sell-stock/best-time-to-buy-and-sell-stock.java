class Solution {
    public int maxProfit(int[] prices) {

        int current_price = prices[0];
        int profit = 0;

        for(int i=0; i<prices.length; i++){
            if(prices[i] < current_price){
                current_price = prices[i];
            }else{
                int current_profit = prices[i] - current_price;
                profit = Math.max(current_profit , profit);
            }
        }
        return profit;
     
    }     
}