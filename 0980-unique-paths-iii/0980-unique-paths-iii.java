class Solution {
    
    int count=0;
    public int uniquePathsIII(int[][] grid) {
        //since i am restricted to move only on 0 and also all the zeros should be covered so,
        //i am moving with the count of zeroes and pass dfs so that when all the covered will will be done then obviously since we have started from the first end so the last end will be 2 (dest)
        //now i eed to count these type of dfs with backtracking
        
        //how this approach will work is
        /* lets take third example
        //grid=[[0,1],[2,0]]
        .. now if we directly do dfs then we will find the path with help of bidirectional mmove
        either right and down or by down and right .. these are two possible paths but we can see
        we are not covering all the zeroes from both the route as there we can see that the answer
        is also zero, which means we are right wr are not covering all the zeroes.
        
        so to deal this i will pass dfs with one restriction that only one way we can count as
        answer if we covered all the o's
        
        code:-
        */
        
        int m=grid.length;
        int n=grid[0].length;
        
        int x=0,y=0,zero=0;
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==1)//one one time start point
                {
                    x=i;y=j;
                }
                if(grid[i][j]==0)
                    zero++;
            }
        
        //now i need to call dfs
        return dfs(grid,x,y,zero);
    }
    
    private int dfs(int[][] grid,int x,int y,int zero)
    {
        if(x>=grid.length || y>=grid[0].length ||x<0 || y<0 || grid[x][y]==-1) return 0;
        
        if(grid[x][y]==2)
            return (zero==-1)?1:0;//check path successful or not
        
        grid[x][y]=-1;//mark it as visited(obstacle)
        zero--;//cover zero
        int totalpath=dfs(grid,x+1,y,zero)+dfs(grid,x-1,y,zero)+dfs(grid,x,y+1,zero)+
            dfs(grid,x,y-1,zero);
            
        grid[x][y]=0;//now our start point is here//backtrack
        zero++;//sice we covered 0 so we need to call again
        
        return totalpath;
    }
}

//tc:- 2^n and space-2^n