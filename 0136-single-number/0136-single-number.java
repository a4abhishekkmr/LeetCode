class Solution {
    public int singleNumber(int[] nums) {
        
//         //sort and iterate as power of 2 if not found then ans will be the last element
        
//         Arrays.sort(nums);
//         if(nums.length==1) return nums[0];
//         for(int i=0;i<nums.length-1;i=i+2)
//         {
//             int a=nums[i];
//             int b=nums[i+1];
            
//             if(a!=b) return a;
//         }
//         return nums[nums.length-1];
        
        //now xor thing as a^a=0 and 0^b=b so my answer will be there
        
        int xor=0;
        
        for(int i=0;i<nums.length;i++)
        {
            xor=xor^nums[i];
        }
        return xor;
    }
}