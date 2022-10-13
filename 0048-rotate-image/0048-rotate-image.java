class Solution {
    public void rotate(int[][] matrix) {
        //taking example of this
//         1,2,3
//         4,5,6
//         7,8,9   to rotate it 90 degree do transpose and then reverse
//             so after transpose
//             1 4 7 
//             2 5 8
//             3 6 9
            
//             and then reversing this
//             7 4 1
//             8 5 2
//             9 6 3
            
//             and this is the result
            
      //transpose first
        
        int n=matrix.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }//row to column
        }
        
        //reverse means first element in row shiftes to the last
        for(int i=0;i<n;i++)
        {
            int low=0,high=n-1;
            while(low<high)
            {
                int temp=matrix[i][low];
                matrix[i][low]=matrix[i][high];
                matrix[i][high]=temp;
                low++;high--;
            }
        }
    }
}