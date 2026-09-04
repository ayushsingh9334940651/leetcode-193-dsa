class Solution {
    public int maxProfit(int[] prices) {
    int buy =prices [0];
    int profit=0;
    for(int i=1;i<prices.length;i++){
        int sell=prices[i]-buy;
       profit=Math.max(profit,sell);
       buy=Math.min(buy,prices[i]);
    }
    return profit;
    }
}