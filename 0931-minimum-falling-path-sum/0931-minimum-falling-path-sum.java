/* Recursive Solution
class Solution {
    public int minFallingPathSum(int[][] matrix) {
        //ok so hat i am getting is to make a dfs solution
        //that will go to the end and will start from all the positions
        
        int n=matrix.length,m=matrix[0].length;
        
        int ans=Integer.MAX_VALUE;
        for(int j=0;j<m;j++)
        {
            ans=Math.min(ans,dfs(matrix,0,j));
        }
        
        return ans;
    }
    
    private int dfs(int[][] matrix,int i,int j)
    {
        int n=matrix.length,m=matrix[0].length;
        if( j<0 || j>=m) return 9999999;
        
        if(i==n-1) return matrix[i][j];
        
        int leftD=dfs(matrix,i+1,j-1)+matrix[i][j];
        int below=dfs(matrix,i+1,j)+matrix[i][j];
        int rightD=dfs(matrix,i+1,j+1)+matrix[i][j];
    
        return Math.min(leftD,Math.min(below,rightD));
    }
}
*/
//but this above solution gives me TLE.
//.. so we need to optimize it. I think we need to solve it with help of Dynamic Programming
// ok so i will proceed with tabulation and what i will be going is
// i will make a dp array of same size and will start from all the elements in first row 
// and by iterating it choosing the minimum path. and finally the n-1th row will store the elements 
// that we will achieve as minimum path choosed to the destinatiom. now we can iterate and find the min.

class Solution {
    public int minFallingPathSum(int[][] matrix) {
        
        int n=matrix.length,m=matrix[0].length;
        
        int dp[][]=new int[n][m];
        
        for(int i=0;i<m;i++){
            dp[0][i]=matrix[0][i];
        }
        for(int i=1;i<n;i++)
        {
            for(int j=0;j<m;j++)
                {
                    if(j==0)
                        dp[i][j]=matrix[i][j]+Math.min(dp[i-1][j],dp[i-1][j+1]);
                    else if(j==m-1)
                        dp[i][j]=matrix[i][j]+Math.min(dp[i-1][j-1],dp[i-1][j]);
                    else
                        dp[i][j]=matrix[i][j]+Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i-1][j+1]));
            }
        }
        int ans=Integer.MAX_VALUE;
              for(int j=0;j<m;j++)
                    ans=Math.min(ans,dp[n-1][j]);
                                                       
        return ans;
    }
}


