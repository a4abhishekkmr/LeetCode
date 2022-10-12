class Solution {
    public int threeSumClosest(int[] nums, int target) {
       
        Arrays.sort(nums);
        
        int closest=Integer.MAX_VALUE;
        
        for(int i=0;i<nums.length-2;i++)
        {
            
            int low=i+1,high=nums.length-1;
            
            while(low<high)
            {
                int triplet=nums[i]+nums[low]+nums[high];
                if(Math.abs(target-closest)>Math.abs(target-triplet))
                    closest=triplet;
                
                if(triplet<target) low++;
                else high--;
            }
            
        }
        
        return closest;
    }
}