class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        //taking extra space
        
        int ans[]=new int[nums.length];
        
        int pivot_count=0;
        int small=0,large=nums.length-1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<pivot)
                ans[small++]=nums[i];
            else if(nums[i]==pivot)
                pivot_count++;
        }
        for(int i=0;i<pivot_count;i++)
        {
            ans[small++]=pivot;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>pivot)
                ans[small++]=nums[i];
        }
        
        return ans;
    }
}