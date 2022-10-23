class Solution {
    public int[] findErrorNums(int[] nums) {
        int n=nums.length;
        
        //either i can do this by arrays.sort
        //or by taking exttra space
        
        int ans[]=new int[2];
        
        boolean check[]=new boolean[n+1];
        for(int x:nums)
        {
            if(check[x]) ans[0]=x;
            check[x]=true;
        }
        for(int i=1;i<=n;i++)
        {
            if(check[i]==false)
                ans[1]=i;
        }
        return ans;
    }
}