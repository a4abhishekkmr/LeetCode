class Solution {
    public int numTilings(int n) {
        if(n==1||n==2) return n;
        if(n==3) return 5;
        
        long first=1,second=2,third=5;
        
        long mod=1000000007;
        
        for(int i=4;i<=n;i++)
        {
            long temp=(third*2+first)%mod;
            first=second;
            second=third;
            third=temp;
        }
        return (int)third;
    }
}