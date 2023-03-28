class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int n=days.length;
        int dp[]=new int[n+1];
        int weekPointer=n-1;
        int monthPointer=n-1;
        
        dp[n]=0;
        
        for(int curr=n-1;curr>=0;curr--)
        {
            while(days[weekPointer] - days[curr]>=7)
                weekPointer--;
            
            while(days[monthPointer]-days[curr]>=30)
                monthPointer--;
            
            dp[curr]=MinThree(costs[0]+ dp[curr+1], costs[1] +dp[weekPointer+1],costs[2]+dp[monthPointer+1]);
        }
        
        return dp[0];
    }
    
    public int MinThree(int i,int j,int k)
    {
        return Math.min(i,Math.min(j,k));
    }
}