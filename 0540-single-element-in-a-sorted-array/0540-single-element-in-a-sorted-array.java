class Solution {
    public int singleNonDuplicate(int[] nums) {
        //first lets go wit O(n) approach
        for(int i=0;i<nums.length-1;i+=2)
        {
            if(nums[i]!=nums[i+1]) return nums[i];
        }
        return nums[nums.length-1];
     }
}