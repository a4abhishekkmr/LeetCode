class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        
        
        int n=rowSum.length;
        int m=colSum.length;
        
        int ans[][]=new int[n][m];
        
        for(int i=0;i<n;i++)
        {
            int min=0;
            for(int j=0;j<m;j++)
            {
                if(rowSum[i]<colSum[j])
                    min=rowSum[i];
                else
                    min=colSum[j];
                
                ans[i][j]=min;
                rowSum[i]-=ans[i][j];
                colSum[j]-=ans[i][j];
            }
        }
        return ans;
    }
}