class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        Arrays.sort(nums);
        if(k==1) return(nums[nums.length-1]);
        if(k>nums.length)
        k=k%nums.length;
        return nums[nums.length-k];
    }
}