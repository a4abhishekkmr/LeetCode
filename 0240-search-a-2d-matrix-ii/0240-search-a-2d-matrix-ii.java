class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        //ok so a very good approach is coming just with the help of binarysearch
        
        int n=matrix.length;
        int i=0;
        int j=matrix[0].length-1;
        //last element of first row
        
        while(i<n && j>=0)
        {
            if(matrix[i][j]==target) return true;
            else if(matrix[i][j]<target) i++;
            //kyuki chota pad gya to neeche row me aao bada milega
            else j--;//isbar bada pad gya to left or aao chota mil jaega
        }
        
        return false;
    }  
}