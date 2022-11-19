class Solution {
    public int arrangeCoins(int n) {
       
        long l=1,h=n,ans=0,mid=0;
        
        while(l<=h)
        {
            mid=(l+h)/2;
            
            long coins=mid*(mid+1)/2;
            
            if(coins<=n)
            {
                ans=mid;
                l=mid+1;
            }
            else
                h=mid-1;
        }
        
        return (int)ans;
    }
}