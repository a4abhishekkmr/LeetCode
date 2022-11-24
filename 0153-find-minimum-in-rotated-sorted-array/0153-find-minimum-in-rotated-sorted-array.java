class Solution {
    public int findMin(int[] nums) {
        
        if(nums[0] <= nums[nums.length - 1])
        return nums[0];//for no rotation, smallest will be at first
    
        int lo=0,hi=nums.length-1;
        int mid=0;
        while(lo<hi)
        {
            mid=lo+(hi-lo)/2;
            
            if(nums[mid]>nums[hi])
            {
                lo=mid+1;//iska mtlab smallest hmko right me milega
            }
            else
                hi=mid;//lo to mid me milega smallest
        }
        return nums[lo];
    }
}
