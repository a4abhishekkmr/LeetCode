class Solution {
    public int[] rearrangeArray(int[] nums) {
        //either to take 2 arrays of pos and neg.
        
        //1st approach
//         int pos[]=new int[nums.length/2];
//         int neg[]=new int[nums.length/2];
        
//         int j=0,k=0;
//         for(int i=0;i<nums.length;i++)
//         {
//             if(nums[i]>=0)
//                 pos[j++]=nums[i];
                
//             else
//                 neg[k++]=nums[i];
//         }
        
//         for(int i=0;i<nums.length/2;i++)
//         {
//             nums[2*i]=pos[i];
//             nums[2*i+1]=neg[i];
//         }
//         return nums;
        
        //Either use two pointer approach(different way)
        
        int ans[]=new int[nums.length];
        int j=0,k=1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>=0)
            {ans[j]=nums[i];j=j+2;}
            else
            {
                ans[k]=nums[i];k=k+2;
            }
        }
        return ans;
        
    }
}