class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        
        int n=mat.length;
        int m=mat[0].length;
        int ans[][]=new int[n][m];
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                ans[i][j]=find(mat,i,j,k);
            }
        }
        return ans;
    }
    
    private int find(int[][] mat,int x,int y,int k)
    {
        int sum = 0;
    
    for(int i = 0; i<mat.length; i++){
        
        for(int j = 0; j<mat[0].length; j++){
            
            if(x-k <= i && i <= x+k && y-k <= j && j <= y+k){
                sum += mat[i][j];
            }
        }
    }
        return sum;
            
    }
}