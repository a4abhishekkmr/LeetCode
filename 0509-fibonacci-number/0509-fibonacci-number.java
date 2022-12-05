class Solution {
    public int fib(int n) {
        if(n==0 || n==1) return n;
        //1st method recursive
        //return fib(n-1)+fib(n-2);
        
        //2nd method iterative
        
        int a=0;
        int b=1;
        int c=0;
        for(int i=2;i<=n;i++)
        {
            c=a+b;
            a=b;
            b=c;
            //System.out.print(i+" "+c+"   =>");
        }
        return c;
    }
}