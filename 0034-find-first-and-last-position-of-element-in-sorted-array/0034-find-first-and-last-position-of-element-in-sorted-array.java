class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        
        
        int start=bs(nums,target,true);
        int end=bs(nums,target,false);
        int ans[]={start,end};
        
        return ans;
    }
    
    private int bs(int[] nums,int target,boolean firstIndex)
    {
        int ans=-1;
        int lo=0,hi=nums.length-1;
        
        while(lo<=hi)
        {
            int mid=lo+(hi-lo)/2;
            
            if(nums[mid]>target)
            {
                hi=mid-1;
            }
            else if(nums[mid]<target)
            {
                lo=mid+1;
            }
            else
            {
                ans=mid;
                if(firstIndex)
                    hi=mid-1;
                else
                    lo=mid+1;
            }
        }
        return ans;
    }
}