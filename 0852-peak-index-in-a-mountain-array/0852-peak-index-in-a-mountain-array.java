class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n=arr.length;
        int lo=0,high=n-1;
        
        while(lo<=high)
        {
            int mid=lo+(high-lo)/2;
            if((mid==0 || arr[mid-1]<=arr[mid])&&(mid==n-1 || arr[mid+1]<=arr[mid])) return mid;
            if(mid>0 && arr[mid-1]>=arr[mid])
                high=mid-1;
            else
                lo=mid+1;
        }
        return -1;
    }
}