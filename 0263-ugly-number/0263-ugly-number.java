class Solution {
    public boolean isUgly(int n) {
        if(n<=0) return false;
        if(n<=6) return true;
        
        return check(n);
        
    }
    boolean check(int n)
    {
         while(n%2==0)
         {
             n=n/2;
         }
        while(n%3==0)
        {
            n=n/3;
        }
        while(n%5==0)
        {
            n=n/5;
        }
        return n==1?true:false;
    }
}