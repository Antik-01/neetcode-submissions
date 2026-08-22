class Solution {
    public int maxProfit(int[] prices) {
        int l = 0;
        int p = 0;
        for(int r = 0; r<prices.length; r++){
            if(prices[r] < prices[l]){
                l = r;
            }
            p = Math.max(p, prices[r]-prices[l]);
        }
        return p;
    }
}
