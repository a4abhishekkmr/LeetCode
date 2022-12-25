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
        //but no need of dp here either we can go with greedy approach which is sort and count nums
        
        //Approach:- 
        //we will solve for each queries  independently and
        //store it in answer
        //while for each query we need to choose the subsequence as long as possible.
        //for this we need to pick smaller elements first to reach with the solution
        /*
        1.Sort the nums
        2.for every query pass the query along with the nums and check if sorted nums<=query then add length
        3. finally after the loop pass the count of length
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
    */
        
        //2nd approach
        //we will take benefit of PrefixSum and then with the help of binary search we can find the length
        //sort then do prefix sum
        //then finally do binary search<=query[i];
       int n=nums.length;
        int m=queries.length;
        int ans[]=new int[m];
        Arrays.sort(nums);
        
        for(int i=1;i<n;i++)
            nums[i]+=nums[i-1];
        for(int i=0;i<m;i++)
        {
            ans[i]=binarySearch(nums,queries[i]);
        }
        return ans; 
        
    }
    private int binarySearch(int[]nums,int sum)
    {
        int lo=0,hi=nums.length-1;
        while(lo<hi)
        {
            int mid=(lo+hi)/2;
            if(nums[mid]==sum)
                return mid+1;
            if(nums[mid]<sum)
                lo=mid+1;
            else
                hi=mid-1;
        }
        return nums[lo]>sum?lo:lo+1;
    }
}

