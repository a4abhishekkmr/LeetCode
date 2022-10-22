class Solution {
    public int[] sortedSquares(int[] nums) {
        
        //square and sort
        //O of nlogn Soln
        // for(int i=0;i<nums.length;i++)
        // {
        //     nums[i]=nums[i]*nums[i];
        // }
        // Arrays.sort(nums);
        // return nums;
        
        //now O(n) solution instead of sorting i will use 2 pointer approach where i will swap the Modulous values and make it in sorted way then do the squaring and return
        
        int start=0;
        int end=nums.length-1;
        int ans[]=new int[nums.length];
        for(int i=nums.length-1;i>=0;i--)
        {
            if(nums[start]*nums[start]>nums[end]*nums[end])
            {
                
                //put
                ans[i]=nums[start]*nums[start];
                start++;
            }
            else
            {
                ans[i]=nums[end]*nums[end];
                end--;
            }
                
        }
        
        return ans;
        
    }
}
//one more good Solution
//https://leetcode.com/problems/squares-of-a-sorted-array/discuss/2617314/Beast-100-and-90-less-memory-completed-in-O(n)