/*Algorithm
Initialize ans = 0, numSubarray = 0.

Iterate over nums, for each number num:

If num = 0, increment numSubarray by 1.
Otherwise, set numSubarray = 0.
Then increment ans by numSubarray.

Return ans at the end of the iteration.

https://leetcode.com/problems/number-of-zero-filled-subarrays/Figures/2348/2348-2_4.png


TC-O(n) and Space O(1)
*/
class Solution {
    public long zeroFilledSubarray(int[] nums) {
        
        long ans=0,continues=0;
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0) continues++;
            else
                continues=0;
            
            ans+=continues;
        }
        
        return ans;
    }
}