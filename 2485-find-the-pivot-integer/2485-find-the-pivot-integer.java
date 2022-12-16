class Solution {
    public int pivotInteger(int n) {
        //i will use brute force here
//where i have to deal with 
        //for all upto n any number x whose sum upto x from 1 and sum of x to n.
        
        int total=uptoHere(n);
        for(int x=1;x<=n;x++)
        {
            int sum=uptoHere(x);
            int point=total-sum+x;
            if(sum==point) return x;
            //System.out.println(sum+" "+point);
        }
        return -1;
    }
    
    int uptoHere(int n)
    {
        return ((n+1)*n)/2;
    }
}