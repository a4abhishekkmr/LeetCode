class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        //check for all the angles like 90 180 270 and finally for 0
        
        boolean ans=false;
        //0 degree
        ans=check(mat,target);
        if(ans) return true;
        
        //90 degree
        rotate(mat);
        ans=check(mat,target);
        if(ans) return true;
        
        //180 degree
        rotate(mat);
        ans=check(mat,target);
        if(ans) return true;
        
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat.length;j++)
                System.out.print(mat[i][j]+" ");
            
            System.out.println();
        }
        
        //270 degree
        rotate(mat);
        ans=check(mat,target);
        if(ans) return true;
        
        
        
        return ans;
    }
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
    private boolean check(int [][]given,int[][] target)
    {
        int n=given.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
                if(given[i][j]!=target[i][j])
                    return false;
        }
        return true;
    }
}