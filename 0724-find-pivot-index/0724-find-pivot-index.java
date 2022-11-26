class Solution {
    public int pivotIndex(int[] nums) {
        //i will make 2 arrays that will store the sum of its left and its right.
        //then i will iterate on both the arrays if i fetch as same then returns the position else -1;
        
        int left[]=new int[nums.length];
        int right[]=new int[nums.length];
        
        for(int i=1;i<nums.length;i++)
        {
            left[i]=left[i-1]+nums[i-1]; 
        }
        
        int n=nums.length;
        
        for(int i=n-2;i>=0;i--)
        {
            right[i]=right[i+1]+nums[i+1];
        }

        for(int i=0;i<nums.length;i++)
        {
            if(left[i]==right[i]) return i;
        }
        return -1;
    }
}