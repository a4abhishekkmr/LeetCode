class Solution {
    public int search(int[] nums, int target) {
        //ok so here we are given with ascending order so we will use binary search as this is better than linear search(N) to O(logn)
        
        int n=nums.length;
        
        
        return binarySearch(nums,n,target);
    }
    
    int binarySearch(int[] nums,int len,int target)
    {
        int low=0,high=len-1;
        
        int time=0;
        while(low<=high)
        {
            int mid=(low+high)/2;
            
            if(nums[mid]==target)//backside
                return mid;
            else if(nums[mid]>target)
                high=mid-1;
            else
                low=mid+1;
        }
        return -1;
    }
}