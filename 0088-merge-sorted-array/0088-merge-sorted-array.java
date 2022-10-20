class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //first put in nums1 and then do swap thing
        
        for(int i=m;i<m+n;i++)
            nums1[i]=nums2[i-m];
        //all set
        
        //i wont do arrays.sort(nums1) as i need to do this in O(m+n) time
        //take 2 pointers and then compare
        int lo=0,hi=m;
        //   |--------|-------
        
        
        Arrays.sort(nums1);
        
    }
}