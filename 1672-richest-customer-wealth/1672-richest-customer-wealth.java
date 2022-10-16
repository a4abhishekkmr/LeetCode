class Solution {
    public int maximumWealth(int[][] accounts) {
         //pass array into function can reduce time comp instead n^2 loop
        
        
        int max=0;
        for(int i=0;i<accounts.length;i++)
        {max=Math.max(max,function(accounts[i]));
        
        }
        return max;
        
        
    }
    int function(int []ar)
    {
        int sum=0;
        for(int i=0;i<ar.length;i++) sum+=ar[i];
        
        return sum;
    }
}