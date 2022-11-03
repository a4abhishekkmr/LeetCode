class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //either i can do this as i can lock one element and then check for remaining 2 elements sum upto this
        //After sorting 
        
        Set<List<Integer>> hs=new HashSet<>();
        
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            if(i>0 && nums[i]==nums[i-1])
                continue;
            
            int left=i+1,right=nums.length-1;
            
            while(left<right)
            {
                int sum=nums[i]+nums[left]+nums[right];
                
                if(sum==0)
                {
                    hs.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;
                }
                else if(sum<0) left++;
                else right--;
            }
        }
        return new ArrayList<>(hs); //hashset ko list mei convert karke return kardo
    }
}