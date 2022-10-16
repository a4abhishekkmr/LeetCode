class Solution {
    public int subtractProductAndSum(int n) {
        return pro(n)-sum(n);
        
        
    }
    private int pro(int n)
    {
        int p=1;
        while(n>0)
        {
            p=p*(n%10);
            n=n/10;
        }
        return p;
    }
    private int sum(int n)
    {
        int s=0;
        while(n>0)
        {
            s=s+(n%10);
            n=n/10;
        }
        return s;
    }
}