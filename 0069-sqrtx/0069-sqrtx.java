class Solution {
    public int mySqrt(int n) {
        long lo=0,hi=n;
        long ans=0;
        while(lo<=hi)
        {
            long mid=(lo+hi)/2;
            if(mid*mid<n)
            {
                lo=mid+1;
                //mid*mid chota hai to usko equal laane ke lie lo ko badhao
                ans=mid;
            }
            else if(mid*mid>n) hi=mid-1;
            else return (int)mid;
        }
        return (int)ans;
    }
}
