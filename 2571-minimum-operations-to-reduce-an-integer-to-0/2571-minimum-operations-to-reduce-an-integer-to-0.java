class Solution {
    public int minOperations(int n) {
        int count=0;
        while(n!=0)
        {
            int power=roundOf2(n);
            n=Math.abs(n-(int)Math.pow(2,power));
            count++;
        }
        return count;
        
    }
    private int roundOf2(int N)
    {
        int result = (int)Math.round(Math.log(N) / Math.log(2));
        return result;
    }
}