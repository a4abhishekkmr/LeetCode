class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        //taking extra space
        
        int ans[]=new int[nums.length];
        
        int pivot_count=0;
        int small=0;
//         for(int i=0;i<nums.length;i++)
//         {
//             if(nums[i]<pivot)
//                 ans[small++]=nums[i];
//             else if(nums[i]==pivot)
//                 pivot_count++;
//         }
//         for(int i=0;i<pivot_count;i++)
//         {
//             ans[small++]=pivot;
//         }
//         for(int i=0;i<nums.length;i++)
//         {
//             if(nums[i]>pivot)
//                 ans[small++]=nums[i];
//         }
        
//         return ans;
        
        //2nd Approach
        int large=nums.length-1;
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<pivot)
                ans[small++]=nums[i];
            else if(nums[i]>pivot)
                ans[large--]=nums[i];
            else
                pivot_count++;
        }
        for(int i=0;i<pivot_count;i++)
        {
            ans[small++]=pivot;
        }
        
        
        return reverse(ans,large+1,nums.length-1);
        
    }
    
    private int[] reverse(int nums[],int start,int end)
    {
        while(start<end)
        {
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            
            start++;end--;
        }
        return nums;
    }
}