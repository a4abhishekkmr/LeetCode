class Solution {
    public int findMin(int[] nums) {
        
        if(nums[0] <= nums[nums.length - 1])
        return nums[0];//for no rotation, smallest will be at first
    
        int lo=0,hi=nums.length-1;
        int mid=0;
        while(lo<hi)
        {
            mid=(hi+lo)/2;
            if(nums[lo]<nums[hi]) return nums[lo];
            if(nums[mid]>=nums[lo])
            {
                lo=mid+1;
            }
            else
                hi=mid;
        }
        return nums[lo];
    }
}
