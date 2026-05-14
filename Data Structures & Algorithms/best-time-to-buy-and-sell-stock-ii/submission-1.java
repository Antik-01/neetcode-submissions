class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0, low = prices[0];
        for(int i=1; i< prices.length; i++){
            if(prices[i]>=low){
                profit += (prices[i]-low);   
            }
            low = prices[i];
        }
        return profit;
    }
}