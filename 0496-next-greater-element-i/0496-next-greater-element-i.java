class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        int ans[]=new int[nums1.length];
        
        for(int i=0;i<nums1.length;i++)
        {
            int posin2=position(nums1[i],nums2);
            
            int bigger=nextBigger(nums1[i],posin2,nums2);
            
            ans[i]=bigger;
        }
        return ans;
    }
    private int position(int n,int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==n) return i;
        }
        return -1;
    }
    
    private int nextBigger(int n,int pos,int []arr)
    {
        for(int i=pos+1;i<arr.length;i++)
        {
            if(arr[i]>n) return arr[i];
        }
        return -1;
    }
}