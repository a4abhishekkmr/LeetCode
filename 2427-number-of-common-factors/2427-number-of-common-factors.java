class Solution {
    public int commonFactors(int a, int b) {
    //    int count=1;
        
//         int min=a<b?a:b;
        
//         for(int i=2;i<=min;i++)
//         {
//             if(a%i==0 && b%i==0)
//                 count++;
//         }
        
//         return count;
        
        
        //Another Method is to find gcd of both these nums and then find factors of gcd
        int min=a<b?a:b;
        int max=a>b?a:b;
        
        int g=gcd(a,b);//small then big
        
        return factors(g);
        
    }
    private int gcd(int a,int b)
    {
        if(b==0) return a;
        
        else return gcd(b,a%b);
        
    }
    private int factors(int n)
    {
        int count=1;
        for(int i=2;i<=n;i++)
            if(n%i==0) count++;
        return count;
    }
}