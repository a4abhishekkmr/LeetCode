class Solution {
    public boolean isPerfectSquare(int n) {
        
        long lo=1,hi=n;
        
        while(lo<=hi)
        {
            long mid=lo+(hi-lo)/2;
            if(mid*mid==n) return true;
            else if(mid*mid>n) hi=mid-1;
            else lo=mid+1;
        }
        return false;
    }
}
