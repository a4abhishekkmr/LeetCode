class Solution {
    public int countBattleships(char[][] board) {
        //either i can make it by making a vis 2d array or another follow up solution is to modify the X as '.'
        //Another direct solution is that to iterate all chars and check both the back ends like i-1 and j-1 have '.' then mark ++;
        
        int count=0;
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {//we are finding the start points of the battles by checking the previous up and back
                if(board[i][j]=='X' &&(i==0 || board[i-1][j]=='.') && (j==0||board[i][j-1]=='.'))
                    count++;
            }
        }
        return count;
    }
}