class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        
        int merge[]=new int[nums1.length+nums2.length];
        
        int i=0,j=0,k=0;
        while(i<nums1.length && j<nums2.length)
        {
            if(nums1[i]<nums2[j])
            {
                merge[k++]=nums1[i];
                i++;
            }
            else if(nums1[i]>nums2[j])
            {
                merge[k++]=nums2[j];
                j++;
            }
            else
            {
                merge[k++]=nums1[i];
                merge[k++]=nums1[i];
                i++;j++;
            }
        }
        
        while(i<nums1.length)
        {
             merge[k]=nums1[i];
                i++;k++;
        }
        while(j<nums2.length)
        {
             merge[k]=nums2[j];
                j++;k++;
        }
        for(i=0;i<merge.length;i++)
            System.out.print(merge[i]+" ");
        double ans=0;
        if(merge.length%2==1)
            ans=merge[merge.length/2];
        else
        {
            ans=merge[merge.length/2]+merge[(merge.length-1)/2];
            ans=ans/2;
        }
        return ans;
    }
}