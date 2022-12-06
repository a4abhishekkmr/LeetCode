class Solution {
    public int minCostClimbingStairs(int[] cost) {
        //using dP
        //Tc- O(n) and space -O(n)
        
        //ok so here we go. we will take array of size n+2 basically used for tabulation and pick the minimum ones.
        
        int n=cost.length;
        int []dp=new int[n];
        
        dp[0]=cost[0];
        dp[1]=cost[1];
        
        int min=0;
        for(int i=2;i<n;i++)
        {
            if(dp[i-2]<dp[i-1])
                min=dp[i-2];
            else min=dp[i-1];
            dp[i]=min+cost[i];
        }
        return Math.min(dp[n-1],dp[n-2]);//as we are stooping at the last or second last.
    }
}