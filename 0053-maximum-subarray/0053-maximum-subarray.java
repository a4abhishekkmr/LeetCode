class Solution {
    public int maxSubArray(int[] nums) {
        //ok so i have to find the largest sum subarray
        
        
        int max=nums[0],sum=nums[0];
        int n=nums.length;
        if(n==1) return nums[0];
        for(int i=1;i<n;i++)
        {
            sum=Math.max(sum+nums[i],nums[i]);
            max=Math.max(max,sum);
        }
        return max;
    }
}