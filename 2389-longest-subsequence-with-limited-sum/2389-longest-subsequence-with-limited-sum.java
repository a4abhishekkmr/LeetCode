class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        //before beginning with the solution
        //let's discuss what type of problem is this
        /*here we can see that the subsequnce which we will make can be of choises either to pick or not
        and the problem needs optimal solution like maximum so we can clearly say that its a problem of
        DP
        
        and also we can figure out its quite similar to Knapsack problem or we can say its a variation of it.
        so to deal with this solution which is similar to knapsack where i need max length of nums which we
        will pick as subsequence.
        */
        //Approach:- 
        //we will solve for each queries  independently and
        //store it in answer
        //while for each query we need to choose the subsequence as long as possible.
        //for this we need to pick smaller elements first to reach with the solution
        
        int n=nums.length;
        int m=queries.length;
        int ans[]=new int[m];
        Arrays.sort(nums);
        for(int i=0;i<m;i++)
        {
            ans[i]=solve(nums,queries[i]);
        }
        return ans;
    }
    //Time complexity: O(m*n+n⋅logn) and Space complexity: O(n)
    
    private int solve(int[]nums,int sum)
    {
        //now we need to return the max length
        int n=nums.length;
        int count=0;
        for(int x:nums)
        {
            if(sum>=x)
            {
                count++;
                sum-=x;
            }
            else break;
        }
        return count;
    }
}