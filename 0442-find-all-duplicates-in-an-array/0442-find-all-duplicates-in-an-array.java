class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        
        ArrayList<Integer> ans=new ArrayList<>();
        
        int i=0;
        while(i<nums.length)
        {
            int correctindex=nums[i]-1;
            
            if(nums[i]!=nums[correctindex])
                swap(i,correctindex,nums);
            
            else
                i++;
        }
        
        for(int j=0;j<nums.length;j++)
        {
            if(nums[j]!=j+1)
                ans.add(nums[j]);
        }
        return ans;
    }
    
    void swap(int x,int y, int[] nums)
    {
        int temp=nums[x];
        nums[x]=nums[y];
        nums[y]=temp;
    }
}