class Solution {
    public int rob(int[] nums) {
        //ok so this is very basic dp problem where after fibonacci and climbng stairs, it comes.
        
        //ok so lets start, i will do this via memoization..
        //one thing to note, dint think this question is like taking sum of odd and even and comparing them.
        //as for example[2,1,1,3] then we need to choose 2 and 3 by skipping 2 of houses in between so we 
        //can skip any number of houses if needed..
        
        //ok so lets start with the problem'
        //store the max for current house
        
        int dp[]=new int[nums.length+1];
        
        dp[0]=0;
        dp[1]=nums[0];
        //as for 0 house 0 robbery and for first house max robbery will be in 1 house and answer will come from 1st only
        
        for(int i=1;i<nums.length;i++)
        {
            dp[i+1]=Math.max(dp[i],dp[i-1]+nums[i]);
            //next dp point will be filled by previous max and by adding nums[i] to the 2prev element
        }
        
        return dp[nums.length];
    }
}
//TC- O(N) SC- O(N)

//Dry Run
//lets take example 1 - [1,2,3,1]
//now our dp will be filled like 0,1,.,.,.,
//now from i=1; dp[2]=max(1,0+[2]) =>2;  our dp will be filled like 0,1,2,.,.,
//similarly i=2; dp[3]=max(2,1+[3]) => 4;  our dp will be filled like 0,1,2,4,.,
//i=3;dp[4]=max(4,2+[1])  => 4; our dp will be filled like 0,1,2,4,4'


//this last 4 will be our answer as per normal dp format..
//keep coding