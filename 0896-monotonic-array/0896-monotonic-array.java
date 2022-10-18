class Solution {
    public boolean isMonotonic(int[] nums) {
        //first get the point weather the series will be monotonic increasing or decreasing
        //i will make 2 functions for this and return or" of this so that they will tell which one is this
            
         return increasing(nums)||decreasing(nums);   
    }
    
    private boolean increasing(int[] nums)
    {
        int min=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]<min)
                return false;
            else
                min=nums[i];
        }
        return true;
    }
    private boolean decreasing(int[] nums)
    {
        int max=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]>max)
                return false;
            else
                max=nums[i];
        }
        return true;
    }
}