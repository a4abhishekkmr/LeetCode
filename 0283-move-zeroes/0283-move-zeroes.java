class Solution {
    public void moveZeroes(int[] nums) {
        //i will use 2 pointer approach here
        
        int n=nums.length;
        
        if(n==1) return;
        
        int i=0,j=0;
        
        while(j<n)
        {
            if(nums[i]!=0 && nums[j]!=0) {i++;j++;}
            else if(nums[j]==0) j++;
            else if(nums[i]==0 && nums[j]!=0)
            {
                //swap
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;j++;
            }
            
        }
        
    }
}