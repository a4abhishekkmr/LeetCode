class Solution {
    public int maxSatisfaction(int[] satisfaction) {
        // what i am getting is
        // directly sort the array and find the >0 elements and then use counter from 1.
        
        int counter=1;
        
        Arrays.sort(satisfaction);
        
        int ans=0,sum=0,n=satisfaction.length;
        for(int i=n-1;i>=0;i--)
        {
            if(sum+satisfaction[i]>0)
            {
                sum+=satisfaction[i];
                ans+=sum;
            }
            else
                break;
        }
        return ans;
    }
}