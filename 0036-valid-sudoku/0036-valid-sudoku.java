class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(board[i][j]!='.')
                {
                    //System.out.print(checkBox(i,j,board)+" "+checkRow(i,j,board)+" "+checkCol(i,j,board));
                    if((checkBox(i,j,board)==false)||
                    (checkRow(i,j,board)==false)||
                    (checkCol(i,j,board)==false))
                        return false;
                }
            }
        }
        return true;
    }
    boolean checkBox(int x,int y,char[][] board)
    {
        char val=board[x][y];
        int orix=x,oriy=y;
        if(x<3) x=0;
        if(y<3) y=0;
        if(x>=3 && x<6) x=3;
        if(y>=3 && y<6) y=3;
        if(x>=6) x=6;
        if(y>=6) y=6;
        for(int i=x;i<x+3;i++)
        {
            for(int j=y;j<y+3;j++)
            {
                if( i!=orix && j!=oriy && board[i][j]==val)
                    return false;
            }
        }
        return true;
    }
        
    boolean checkRow(int x,int y,char[][] board)
    {
        char val=board[x][y];
        for(int i=0;i<9;i++)
        {
            if(board[i][y]==val && i!=x)
                    return false;
        }return true;
    }
        
            
        
    boolean checkCol(int x,int y,char[][] board)
        
    {char val=board[x][y];
        for(int i=0;i<9;i++)
        {
            if(board[x][i]==val && i!=y)
                    return false;
        }
     return true;
    }
}