/*The basic idea is to do merge sort to nums[]. To record the result, we need to keep the index of each number in the original array. So instead of sort the number in nums, we sort the indexes of each number.
Example: nums = [5,2,6,1], indexes = [0,1,2,3]
After sort: indexes = [3,1,0,2]

While doing the merge part, say that we are merging left[] and right[], left[] and right[] are already sorted.

We keep a rightcount to record how many numbers from right[] we have added and keep an array count[] to record the result.

When we move a number from right[] into the new sorted array, we increase rightcount by 1.

When we move a number from left[] into the new sorted array, we increase count[ index of the number ] by rightcount.
*/

//Code
class Solution {
    int count[];
    public List<Integer> countSmaller(int[] nums) {
        
        int n=nums.length;

        // for(int i=0;i<n-1;i++)
        // {
        //     int count=0;
        //     for(int j=i+1;j<n;j++)
        //     {
        //         if(nums[i]>nums[j])
        //             count++;
        //     }al.add(count);
        //     count=0;
        // }
        // al.add(0);
        // return al;
        
        count=new int[nums.length];
        
        int[] index=new int[n];
        
        for(int i=0;i<n;i++)
            index[i]=i;
        
        mergeSort(nums,index,0,n-1);
       
        List<Integer> res= new ArrayList<>();
        for(int i = 0; i < count.length; i++)
    	res.add(count[i]);

        return res;
    }
    private void mergeSort(int[] nums,int[] index,int start,int end)
    {
        if(start>=end) return;
        
        int mid=(start+end)/2;
        
        mergeSort(nums,index,start,mid);
        mergeSort(nums,index,mid+1,end);
        merge(nums,index,start,end);
    }
    
    private void merge(int nums[],int[] index,int start,int end)
    {
        int mid=(start+end)/2;
        int left=start,right=mid+1;
        
        int rightcount=0;
        
        int newIndex[]=new int[end-start+1];
        
        int sortIndex=0;
        
        while(left<=mid && right<=end)
        {
            if(nums[index[right]]<nums[index[left]])
            {
                newIndex[sortIndex]=index[right];
                rightcount++;
                right++;
            }
            else
            {
                newIndex[sortIndex]=index[left];
                count[index[left]]+=rightcount;
                left++;
            }
            sortIndex++;
        }
        while(left<=mid)
        {
            newIndex[sortIndex]=index[left];
            count[index[left]]+=rightcount;
            left++;
            sortIndex++;
        }
        while(right<=end)
            newIndex[sortIndex++]=index[right++];
        
        for(int i=start;i<=end;i++)
            index[i]=newIndex[i-start];
    }
}