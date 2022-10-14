class Solution {
    public int matrixScore(int[][] grid) {
       //ok so i will go with row wise and calculate the number of 1s in it if it is less and even eual but first char==0 then invert 
        
        int n=grid.length;//neeche
        int m=grid[0].length;
        for(int i=0;i<n;i++)
        {
            int count1=0;
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==1)
                    count1++;
            }
            if(grid[i][0]==0 ||(grid[i][0]==0 && count1<=m/2))
            {
                //invert
                //System.out.println("row"+" "+i);
                for(int k=0;k<m;k++)
                {
                    if(grid[i][k]==1)
                        grid[i][k]=0;
                    else
                        grid[i][k]=1;
                }
            }
        }
        //row over
        //now column
        
        for(int i=0;i<m;i++)
        {
            int count1=0;
            for(int j=0;j<n;j++)
            {
                if(grid[j][i]==1)
                    count1++;
            }
            if(count1<=n/2)
            {
                //invert
                //System.out.println("col"+" "+i);
                for(int k=0;k<n;k++)
                {
                    if(grid[k][i]==1)
                        grid[k][i]=0;
                    else
                        grid[k][i]=1;
                }
            }
        }
        //print
        int sum=0;
        for(int i=0;i<n;i++)
        {
            int num=0;
            int power=0;
            for(int j=m-1;j>=0;j--)
            {
                
                if(grid[i][j]==1)
                    sum+=Math.pow(2,power);
                power++;
            }//System.out.println();
        }
        
        return sum;
    }
}