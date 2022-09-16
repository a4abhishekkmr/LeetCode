class Solution {
    public int diagonalSum(int[][] mat) {
        ///we have to consider for the length of square matrix if it is odd then it is going to be add only 1 times in the center but not to worry in terms of even length
 /*           
            [[1,2,3],
              [4,5,6],
              [7,8,9]]    sum: 1 + 5 + 9 + 3 + 7 = 25
                    
                    
                    
             [[1,1,1,1],
              [1,1,1,1],
              [1,1,1,1],
              [1,1,1,1]]   Output: 8       
              
              */
            
            
            int sum=0;
            for(int i=0;i<mat.length;i++)
            {
                    sum+=mat[i][i];
                    sum+=mat[mat.length-i-1][i];
                   
            }
            
            if(mat.length%2==1)
            {
                    sum-=mat[mat.length/2][mat.length/2];
            }
            
            return sum;
    }
}