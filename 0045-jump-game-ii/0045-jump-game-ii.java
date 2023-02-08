class Solution {
    public int jump(int[] nums) {
        
        int count=0,reached=0,sight=0;
        
        for(int i=0;i<nums.length-1;i++)
        {
            sight=Math.max(sight,i+nums[i]);
            
            if(i==reached)
            {
                count++;
                reached=sight;
            }
        }
        return count;
    }
}
//Tc-O(n) and Sc-O(1)