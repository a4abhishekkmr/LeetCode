class Solution {
    public boolean canJump(int[] nums) {
        //ok so this is a dp question where i have to choose or pick the nums[i] which will let me go to the nums[i]+i;
        //i need to return boolean value where i will declare that i can reach to the end or not
        
        int n=nums.length;
        int jump=0;
        for(int i=0;i<n-1;i++)
        {
            if(jump<=0 && nums[i]==0) return false;
            if(jump<nums[i]) jump=nums[i];
            jump--;
        }
        return true;
    }
}