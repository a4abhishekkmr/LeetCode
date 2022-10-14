class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        
        
        int ans[]=new int[nums.length];
        
        int maxValue=(int)Math.pow(2,maximumBit)-1;
        
        int xor=0;
        for(int x:nums)
            xor=xor^x;
        
        //first one all put
        ans[0]=maxValue^xor;
        
        //same element k sath xor means that eleement is deleted
        
        int j=1;
        for(int i=nums.length-1;i>=1;i--)
        {
           xor=xor^nums[i];
            
            ans[j]=xor^maxValue;
            j++;
        }
 
        
        return ans;
    }
}