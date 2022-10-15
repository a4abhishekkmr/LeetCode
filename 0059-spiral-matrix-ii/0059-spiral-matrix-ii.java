class Solution {
    public int[][] generateMatrix(int n) {
        
        int ans[][]=new int[n][n];
        
                //so making outermost boundary first
        int top=0,right=n-1,bottom=n-1,left=0;
        
        int val=1;
        while(top<=bottom && left<=right)
        {
            for(int i=left;i<=right;i++)
            {
                ans[top][i]=
                val++;
            }
            top++;
            
            for(int i=top;i<=bottom;i++)
            {
                ans[i][right]=
                val++;
            }
            right--;
            
            if(top<=bottom)
            {
                for(int i=right;i>=left;i--)
            {
                ans[bottom][i]=
                    val++;
            }
                bottom--;
            }
            
            if(left<=right)
            {
                for(int i=bottom;i>=top;i--)
            {
                ans[i][left]=
                    val++;
            }
                left++;
            }
            
        }
        
        return ans;
    }
}
