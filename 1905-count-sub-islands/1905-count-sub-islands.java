// at what circustances will we consider an island B in grid2 is a sub-island of island A in grid1?
// it is when all cells of island B are also island cells in island A
// ** in other words:
// if there is some cell in islandB that is water in corresponded cell of island A, 
// then island B is not a sub-island of island A

// os the idea is we have to traverse all islands in grid2,
// and exclude those island that are not sub-island in grid1
// then what's left are all sub-island

class Solution {
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        //so whats going on my mind is to traverse all the 1's of grid2 we get and sink them as edges are also covered with water
        int n=grid1.length;
        int m=grid1[0].length;
        
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                //we need to check the lands which were island in grid2 but water in grid 1 which makes
                //them - non Sub island as grid1 has water and grid2 land is vice versa so we have to water fill all of those lands
                if(grid1[i][j]==0 && grid2[i][j]==1)
                {
                    
                dfs(grid2,i,j);}//mark all the connected island as sink in water
            }
        }
        
        //now the left over body is completly a part of subIsland of grid 1 now we have to count islands
        //so for doing that previous ques no 200 will work as pass the dfs increase count and sink all the visited or joined islands.
        int ans=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid2[i][j]==1)
                {
                    ans++;
                dfs(grid2,i,j);}//mark all the connected island as sink in water
            }
        }
        return ans;
    }

    private void dfs(int[][] grid2,int i,int j)
    {
        //boundary se bahar ya paani me aajae to return
        if(i<0 || j<0 || i>=grid2.length|| j>=grid2[0].length || grid2[i][j]==0)
            return;
        
        grid2[i][j]=0;//sab ko duba do paani me jo visit ho jae
        
        dfs(grid2,i-1,j);
        dfs(grid2,i+1,j);
        dfs(grid2,i,j-1);
        dfs(grid2,i,j+1);
    }
}