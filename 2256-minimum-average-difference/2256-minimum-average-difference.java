class Solution {
    public int minimumAverageDifference(int[] nums) {
        //ok so lets find first avg diff
    //and for that i need sum of all the nums
        
        long sum=0,add=0;
        for(int x:nums)
        {
            sum+=x;
        }
        int n=nums.length;
        
        int mindiff=Integer.MAX_VALUE;
        
        int ans=-1;
        for(int i=0;i<n;i++)
        {
            add+=nums[i];
            
            long a=add/(i+1);
            long b=sum-add;
            if(i!=n-1)
            b/=(n-i-1);
            
            int currdiff=(int)Math.abs(a-b);
            
            if(currdiff<mindiff)
            {
                mindiff=currdiff;
                ans=i;
            }
        }
        return ans;
    }
}