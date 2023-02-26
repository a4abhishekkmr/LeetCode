class Solution {
    public int coinChange(int[] coins, int amount) {
        if(amount==0) return 0;
        
        int dp[]=new int[amount+1];
        
        for(int i=1;i<=amount;i++)
        {
            int max=Integer.MAX_VALUE;
            
            for(int sum:coins)
            {
                if(sum<=i && dp[i-sum]!=-1)
                {
                    max=Math.min(dp[i-sum],max);
                }
            }
            dp[i]=(max==Integer.MAX_VALUE)?-1:1+max;
        }
        return dp[amount];
    }
}