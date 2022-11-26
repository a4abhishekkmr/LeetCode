class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        
        
    //     int ans[][]=new int[grid.length][grid[0].length];
    //     for(int i=0;i<grid.length;i++)
    //     {
    //         for(int j=0;j<grid[0].length;j++)
    //         {
    //             ans[i][j]=finder(grid,i,j);
    //         }
    //     }
    //     return ans;
    // }
    // private int finder(int[][] grid,int row,int col)
    // {
    //     int zero=0,one=0;
    //     for(int i=0;i<grid[0].length;i++)
    //     {
    //         if(grid[row][i]==0) zero++;
    //         else one++;
    //     }
    //     for(int i=0;i<grid.length;i++)
    //     {
    //         if(grid[i][col]==0) zero++;
    //         else one++;
    //     }
    //     return one-zero;
        
              
        int ans[][]=new int[grid.length][grid[0].length];
        
        int row[]=new int[grid.length];
        int col[]=new int[grid[0].length];
        
        
        for(int i=0;i<grid.length;i++)
        {
            row[i]=rowfind(grid,i);
        }
        for(int j=0;j<grid[0].length;j++)
        {
            col[j]=colfind(grid,j);
        }
    
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                ans[i][j]=row[i]+col[j];
            }
        }
        return ans;
        
    }
    private int rowfind(int[][] grid,int row)
    {
        int t=0;
        for(int i=0;i<grid[0].length;i++)
        {
            if(grid[row][i]==1) t++;
            else t--;
        }
         return t;   
    }
    private int colfind(int[][] grid,int col)
    {
        int t=0;
        for(int i=0;i<grid.length;i++)
        {
            if(grid[i][col]==1) t++;
            else t--;
        }
         return t;   
    }
}