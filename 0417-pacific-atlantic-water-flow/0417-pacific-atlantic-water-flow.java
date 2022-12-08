class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        
        List<List<Integer>> ans=new ArrayList<>();
        
        //ok so my point is i have to check both the sides as dfs for  pacific and atlantic
        //but this dint worked due to high time complexity.
        //What we can do is lets reframe this question in new way by using time space tradeoff.
        
        //take 2 grid of boolean same size and mark is this point i,j is reachable from pacific and other grid from atlantic.
        //then we will be having 2 grids saying accessable from pacific and atlantic. now check if both 
        //accessable then put it as a ans.
        
        int n=heights.length;
        int m=heights[0].length;
        boolean[][] pacificgrid=new boolean[n][m];//pacific
        boolean[][] atlanticgrid=new boolean[n][m];//atlantic
        
        for(int i=0;i<n;i++)
        {
            dfs(i,0,heights,pacificgrid,Integer.MIN_VALUE);
            dfs(i,m-1,heights,atlanticgrid,Integer.MIN_VALUE);
        }
        //right and left covered as pacific and atlantic reach out
        
        for(int j=0;j<m;j++)
        {
            dfs(0,j,heights,pacificgrid,Integer.MIN_VALUE);
            dfs(n-1,j,heights,atlanticgrid,Integer.MIN_VALUE);
        }
        
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
                if(pacificgrid[i][j] && atlanticgrid[i][j])
                    ans.add(List.of(i,j));
        
        return ans;
    }
    
    private void dfs(int i,int j,int[][] heights, boolean[][] grid,int val)
    {
        if(i<0 || i>=heights.length || j<0 || j>=heights[0].length || grid[i][j]==true || heights[i][j]<val)
            return;
        
        grid[i][j]=true;
        
        dfs(i-1,j,heights,grid,heights[i][j]);
        dfs(i+1,j,heights,grid,heights[i][j]);
        dfs(i,j-1,heights,grid,heights[i][j]);
        dfs(i,j+1,heights,grid,heights[i][j]);
    }
}