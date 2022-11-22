class Solution {
    public int specialArray(int[] nums) {
        //Arrays sorting and BinarySearch
        
        Arrays.sort(nums);
        
        int n=nums.length;
        int lo=0,hi=n;
        
        while(lo<=hi)
        {
            int mid=lo+(hi-lo)/2;
            int count=0;
            for(int x:nums)
                if(x>=mid) count++;
            
            if(mid==count)
            {
                return mid;
            }
            else if(count>mid)
                lo=mid+1;
            else
                hi=mid-1;
        }
        return -1;
    }
}