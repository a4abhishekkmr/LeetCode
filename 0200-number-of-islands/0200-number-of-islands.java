class Solution {
    public int numIslands(char[][] grid) {
        
        //so whats going on my mind is to traverse all the 1's we get and sink them as edges are also covered with water
        int n=grid.length;
        int m=grid[0].length;
        
        int ans=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]=='1')
                { ans++;
                dfs(grid,i,j);}//mark all the connected island as something other lets say 2
            }
        }
        
        return ans;
        
    }

    //marking as 2 will be treated as visited island
    private void dfs(char[][] grid,int i,int j)
    {
        //boundary se bahar ya paani me aajae to return
        if(i<0 || j<0 || i>=grid.length|| j>=grid[0].length || grid[i][j]=='0')
            return;
        grid[i][j]='0';//sab ko duba do paani me jo visit ho jae
        
        dfs(grid,i-1,j);
        dfs(grid,i+1,j);
        dfs(grid,i,j-1);
        dfs(grid,i,j+1);
    }
}