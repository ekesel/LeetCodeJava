class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minBuy = prices[0], maxSell = prices[0];
        
        for(int n: prices){
            if(n < minBuy){
                minBuy = n;
                maxSell = n;
            }
            else if(n > maxSell){
                maxSell = n;
            }
            maxProfit = Math.max(maxProfit, maxSell-minBuy);
        }
        return maxProfit;
    }
}