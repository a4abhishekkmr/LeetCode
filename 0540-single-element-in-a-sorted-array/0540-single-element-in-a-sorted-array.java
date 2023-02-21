class Solution {
    public int singleNonDuplicate(int[] nums) {
        //first lets go wit O(n) approach
        // for(int i=0;i<nums.length-1;i+=2)
        // {
        //     if(nums[i]!=nums[i+1]) return nums[i];
        // }
        // return nums[nums.length-1];
        
        // its giving me 30% fater among all the solutions lets go with more faster solution then
        //     so i am looking for Binary search solution as we have sorted array and to get benefit of that
        //         we can do one thing is we can check for mid and compare it
                    
        int i=0,j=nums.length-1;
        
        //int mid=(i+j)/2;
        
        while(i<j)
        {
            int mid=i+(j-i)/2;
            
            //if(nums[mid]!=nums[mid+1] && nums[mid]!=nums[mid-1] ) return nums[mid];
            if(mid%2==0) mid--;
            if(nums[mid] == nums[mid-1])
                i = mid+1;
            else
               j = mid-1;
        }
        return nums[i];
     }
}