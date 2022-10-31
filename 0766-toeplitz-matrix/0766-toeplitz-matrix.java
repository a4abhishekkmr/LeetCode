class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        //we have to check for all the diagonals for ex
        //matrix = [[1,2,3,4],[5,1,2,3],[9,5,1,2]]

//In the above grid, the diagonals are:
//"[9]", "[5, 5]", "[1, 1, 1]", "[2, 2, 2]", "[3, 3]", "[4]".
        
        if (matrix.length <= 1 || matrix[0].length <= 1) {
            return true;
        }
        
        for(int i=0;i<matrix.length-1;i++)
        {
            for(int j=0;j<matrix[0].length-1;j++)
            {
                if(matrix[i][j]!=matrix[i+1][j+1])
                    return false;
            }
        }
        return true;
    }
}