class Solution {
    public int search(int[] arr, int x) {
        //x is target here
        int low=0,high=arr.length-1;
        
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            
            if(arr[mid]==x) return mid;
            //upto here is like normal binary search
            
            
            if(arr[low]<=arr[mid])
            {
                //left half sorted method
                if(x>=arr[low] && x<arr[mid])//concept of checking first to mid 
                    high=mid-1;
                else
                    low=mid+1;
            }
            else//right half sorted and find
            {
                if(x>arr[mid] && x<=arr[high])
                    low=mid+1;
                else
                    high=mid-1;
            }
        }
        return -1;
    }
}