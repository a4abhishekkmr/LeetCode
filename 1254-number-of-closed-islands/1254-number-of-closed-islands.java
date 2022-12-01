class Solution {
    public int closedIsland(int[][] grid) {
        //ok so whats in my mind is 
        //we cant be able to consider the border left right top bottom elements
        //border attached saare lands ko mark as filled with water
        //so mark them as filled with water
        
        int n=grid.length;
        int m=grid[0].length;
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                
                if(i==0 ||j==0|| i==n-1||j==m-1)
                    if(grid[i][j]==0)
                        dfs(grid,i,j);
                //filled with water
            }
        }
        
        int ans=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==0)
                { ans++;
                dfs(grid,i,j);}//mark all the connected island as something other lets say 2
            }
        }
        
        return ans;
    }
    //marking as 2 will be treated as visited island
    private void dfs(int[][] grid,int i,int j)
    {
        //boundary se bahar ya paani me aajae to return
        if(i<0 || j<0 || i>=grid.length|| j>=grid[0].length || grid[i][j]==1)
            return;
        grid[i][j]=1;//sab ko duba do paani me jo visit ho jae
        
        dfs(grid,i-1,j);
        dfs(grid,i+1,j);
        dfs(grid,i,j-1);
        dfs(grid,i,j+1);
    }
}