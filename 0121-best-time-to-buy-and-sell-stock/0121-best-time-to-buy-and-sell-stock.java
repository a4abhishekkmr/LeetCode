class Solution {
    public int maxProfit(int[] prices) {
        
        
        int profitmax=0; int min=Integer.MAX_VALUE;
        
        for(int i=0;i<prices.length;i++)
        {
            profitmax=Math.max(prices[i]-min,profitmax);
                min=Math.min(min,prices[i]);
        }
        return profitmax;
    }
}