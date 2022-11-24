class Solution {
    public boolean exist(char[][] board, String word) {
        
        int n=board.length;
        int m=board[0].length;
        
        boolean vis[][]=new boolean[n][m];
    
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
            {
                if(board[i][j]==word.charAt(0) && dfs(i,j,board,word,vis,0))
                    return true;
            }
        return false;
    }
    
    private boolean dfs(int i,int j,char[][] board, String word,boolean[][] vis,int index)
    {
        if(index==word.length())
        {
            
            return true;
        }
        
        if(i<0 || j<0 || i>=board.length|| j>=board[0].length||vis[i][j]||word.charAt(index)!=board[i][j]) return false;
        
        
        
        vis[i][j]=true;
        
        if(dfs(i-1,j,board,word,vis,index+1)||
        dfs(i+1,j,board,word,vis,index+1)||
        dfs(i,j+1,board,word,vis,index+1)||
        dfs(i,j-1,board,word,vis,index+1))
            return true;
        
        vis[i][j]=false;
        
        return false;
    }
}