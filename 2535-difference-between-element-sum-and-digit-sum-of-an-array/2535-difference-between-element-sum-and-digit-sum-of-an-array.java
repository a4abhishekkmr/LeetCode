class Solution {
    public int differenceOfSum(int[] nums) {
        int elementSum=0;
        
        for(int x:nums) elementSum+=x;
        
        int digitSum=0;
        
        for(int i=0;i<nums.length;i++)
        {
            digitSum+=sum(nums[i]);
        }
        
        return Math.abs(digitSum-elementSum);
    }
    
    private int sum(int n)
    {
        int s=0;
        while(n>0)
        {
            s+=n%10;
            n=n/10;
        }
        return s;
    }
}