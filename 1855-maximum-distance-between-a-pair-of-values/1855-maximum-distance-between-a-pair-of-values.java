class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        //array two pointers binarySearch
        
        
        //Naive Solution- O(n^2)
        /*
        int dist=0;
        for(int i=0;i<nums1.length;i++)
        {
            for(int j=i;j<nums2.length;j++)
            {
                if(nums1[i]<=nums2[j])
                    if(j-i>dist) dist=j-i;
            }
        }
        return dist;*/
        
        
        //Ok so what i will do is for every i in num1 using for loop i will start finding the element in nums2 which is lesser and the most farest from i; and for seaeching i will use binary Search by comparing form current i as start and end as the m elements of nums2.
		//now in the binary search if mid<nums1[i] then start ko mid se aage
		//else end ko mid se peeche, the concept behind binary search.
		
		//so here we go.
        
        int d=0;
        for(int i=0;i<nums1.length;i++)
        {
            int start=i;
            int end=nums2.length-1;
            while(start<=end)
            {
                int mid=(start+end)/2;
                if(nums1[i]<=nums2[mid])
                {
                   if(mid-i>d) d=mid-i;
                    start=mid+1;//oor v durr le jao
                }
                else
                    end=mid-1;
            }
        }
        return d;
    }
}