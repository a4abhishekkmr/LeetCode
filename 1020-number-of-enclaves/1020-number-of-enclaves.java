class Solution {
    public int numEnclaves(int[][] grid) {
        //ok so what coming on my mind is to iterate over all the border of the grid and catch the 1's
        //and mark them with 0 as sea sink and then move dfs through all of that connected 1. so that if any
        //island is connected to that means the person can reach to the boundary.
        //so our first aim is to sink the island connected to the boundary.
        
        int n=grid.length;
        int m=grid[0].length;
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(i==0 || j==0 || j==m-1 || i==n-1)
                if(grid[i][j]==1)
                    dfs(grid,i,j);
            }
        }     

        //now the left over body is completly a part of Enclave now we have to count islands
        //so for doing that previous ques no 2000 will not work 
        //here we have to just count the number of 1's.
        int ans=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==1)
                    ans++;
            }
        }
        return ans;
    }
        
        //this is same as ques no 2000.
    private void dfs(int[][] grid,int i,int j)
    {
        //boundary se bahar ya paani me aajae to return
        if(i<0 || j<0 || i>=grid.length|| j>=grid[0].length || grid[i][j]==0)
            return;
        
        grid[i][j]=0;//sab ko duba do paani me jo visit ho jae
        
        dfs(grid,i-1,j);
        dfs(grid,i+1,j);
        dfs(grid,i,j-1);
        dfs(grid,i,j+1);
    }
}