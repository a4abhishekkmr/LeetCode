class Solution {
    public int countNegatives(int[][] grid) {
        //we will start from top right and check if it is negative then oproceed with left else
           // skip that row and proceed the row below
             
            int count=0;
            //this count is my brhmastra
            
            int m=grid[0].length;
            
            for(int i=0;i<grid.length;i++)
            {
                    
                    if(grid[i][m-1]<0)
                    {
                            //less than then only check for back
                            int lastpos=m-1;
                            while(lastpos>=0 && grid[i][lastpos]<0 )
                            {
                                    count++;
                                    lastpos--;
                            }
                            
                    }
            }
            return count;
    }
}