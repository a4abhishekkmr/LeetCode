class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int ans[]=new int[nums.length];
        
        int zero=0;
        int pro=1;
        for(int x:nums)
        {
            if(x!=0)
                pro*=x;
            else
                zero++;
        }
           System.out.print(zero); 
        
        for(int i=0;i<nums.length;i++)
        {
            if(zero>1) ans[i]=0;
            else if(zero>0 && nums[i]!=0)
                ans[i]=0;
            
            else if(nums[i]!=0)
            ans[i]=pro/nums[i];
            else
                ans[i]=pro;
        }
        return ans;
    }
}