class Solution {
    public int searchInsert(int[] nums, int target) {
        //since sorted, I will use Binary Search for this
        
        int lo=0,high=nums.length-1;
        
        while(lo<=high)
        {
            int mid=lo+(high-lo)/2;
            if(nums[mid]==target) return mid;
            if(nums[mid]>target)
                high=mid-1;
            else
                lo=mid+1;
        }
        return lo;
    }
}