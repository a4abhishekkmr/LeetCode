class Solution {
    public int uniquePaths(int m, int n) {
        //dp
        //with help of 2d array
        //tabulation
        
        int dp[][]=new int[m][n];
        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0 || j==0) dp[i][j]=1;
                else
                {
                    int right=dp[i][j-1];
                    int down=dp[i-1][j];
                    dp[i][j]=right+down;
                }
            }
        }
        return dp[m-1][n-1];
    }
}