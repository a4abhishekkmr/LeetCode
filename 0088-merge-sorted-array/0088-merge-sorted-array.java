class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
//         //first put in nums1 and then do swap thing
        
//         for(int i=m;i<m+n;i++)
//             nums1[i]=nums2[i-m];
//         //all set
        
//         //i wont do arrays.sort(nums1) as i need to do this in O(m+n) time
//         //take 2 pointers and then compare
//         int lo=0,hi=m;
//         //   |--------|-------
        
        
//         Arrays.sort(nums1);
        
        
        //Another Way
        
        //take it in another array
        //then merge sort
        int spare[]=new int[m];
        for(int i=0;i<m;i++)
            spare[i]=nums1[i];
        
        int i=0,j=0;
        int k=0;
        while(i<m && j<n)
        {
            if(spare[i]<=nums2[j])
            {nums1[k]=spare[i];i++;}
            else
            {
                nums1[k]=nums2[j];j++;
            }
            k++;
        }
        
        while(i<m)
        {
            nums1[k]=spare[i];
            i++;k++;
        }
        while(j<n)
        {
            nums1[k]=nums2[j];
            j++;k++;
        }
        
    }
}