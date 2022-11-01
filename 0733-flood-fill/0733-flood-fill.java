class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc] == color) return image;
        int curr=image[sr][sc];
        DFS(image,sr,sc,curr,color);

        return image;
    }

    
    private void DFS(int[][] grid,int i,int j,int curr,int new_color)
    {
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j]!=curr)
            return;
        
            grid[i][j]=new_color;
            DFS(grid,i-1,j,curr,new_color);
        DFS(grid,i+1,j,curr,new_color);
        DFS(grid,i,j-1,curr,new_color);
        DFS(grid,i,j+1,curr,new_color);
        
    }
}
