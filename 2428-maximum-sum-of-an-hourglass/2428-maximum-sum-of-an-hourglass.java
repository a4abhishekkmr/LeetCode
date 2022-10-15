class Solution {
    public int maxSum(int[][] grid) {
        
        
        int maxsum=0;
        int n=grid.length;//-
        int m=grid[0].length;//|
        
        for(int i=1;i<n-1;i++)
        {
            for(int j=1;j<m-1;j++)
                maxsum=Math.max(maxsum,find(grid,i,j));
        }
        return maxsum;
    }
    
    private int find(int[][] grid,int x,int y)
    {
        
        return grid[x-1][y-1]+grid[x-1][y]+grid[x-1][y+1] + grid[x][y] + grid[x+1][y-1]+grid[x+1][y]+grid[x+1][y+1]; 
    }
    
}