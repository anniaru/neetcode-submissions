class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int buyCoinIdx = 0;
        for (int i = 1; i < prices.length; i++){
            int profit = prices[i] - prices[buyCoinIdx];
            maxProfit = Math.max(maxProfit, profit);
            if (prices[buyCoinIdx] > prices[i]){
                buyCoinIdx = i;
            }
        }
        return maxProfit;
    }
}
