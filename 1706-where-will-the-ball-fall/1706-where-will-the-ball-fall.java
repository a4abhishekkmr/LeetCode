class Solution {
    public int[] findBall(int[][] grid) {
        
        int ans[]=new int[grid[0].length];
        for(int i=0;i<grid[0].length;i++)
        {
            ans[i]=dfs(grid,0,i);
        }
        
        return ans;
    }
    private int dfs(int[][] grid,int i,int j)
        //i is row here and j is col
    {
        if(i==grid.length)
            return j;
        
        if(j<0 || j>=grid[0].length)
            return -1;
        
        if(grid[i][j]==1 && j+1<grid[0].length && grid[i][j+1]==1)
            return dfs(grid,i+1,j+1);
        
        else if(grid[i][j]==-1 && j-1>=0 && grid[i][j-1]==-1)
            return dfs(grid,i+1,j-1);
         
        return -1;
    }
}