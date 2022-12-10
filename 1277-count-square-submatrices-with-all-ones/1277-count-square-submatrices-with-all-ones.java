class Solution {
    public int countSquares(int[][] matrix) {
        //ok so this is very good question and really needs to be visualized.
        /*
        first read the question properly and understand the problem with careful reading over example and explantion
        
        now coming to the part of naive solution
        we can solve this by taking a size of 1 to n increasing square shaped which will start from pos 0,0
        and will iterate over the matrix multiple times.
        but this is so time consuming for every size of box i have to start from corner and icreaasing size
        also a problem along with checking for any 0 present in that k*k box, if present then not consider.
        
        all of these are making it such a complex problem.
        
        
        let's use it via dp.
        and i came with the approach that
        for very first we need to have count of all 1's present in the box.
        now we need to check for box of size 2. so for that
        lets consider this matrix 
        0 1
        1 1 
        
        and now if we need to check that is this is of all 1's of box 2 size.
        then we can see 1 0 is present but how we can find this 0. we can find this by finding minimum in all
        of these and if any of these are less we can get and for dp 
        we will set the currrent dp[i][j]=as minimum of all the tri(diagonal,up,left) and then add 1.
        
        now this 1 adds for the current 1 of box 1 size and the others min will specify the size of box valid
        at this point.
        (for 0 we will leave it as it is)
        and so on
        now our dp will contain something like
        0 1 1 1 
        1 1 2 2
        0 1 2 3
        
        so for a particular number lets suppose 2. we can say that- this 2 says the max size of box ended at
        this point.
        
        now finally just sum up all these
        
        just try to visualize it with the code.
        
        
        Time comp:- O(n^2)
        Space comp:- O(n^2)
        
        Code:-
        */
        int n=matrix.length,m=matrix[0].length;
        int dp[][]=new int[n][m];
        
        
        int sum=0;
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(matrix[i][j]==0) dp[i][j]=0;
                else if(i==0||j==0) {dp[i][j]=1;//coz 0's are dealed already and only 1's left
                                     sum+=1;}
                else
                {
                    dp[i][j]=1+Math.min(dp[i-1][j],Math.min(dp[i][j-1],dp[i-1][j-1]));
                    sum+=dp[i][j];
                }
            }
        }
        
        return sum;
    }
}