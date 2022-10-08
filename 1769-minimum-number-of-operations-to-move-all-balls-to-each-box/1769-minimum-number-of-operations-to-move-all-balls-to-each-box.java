class Solution {
    public int[] minOperations(String boxes) {
        //ok i understood the problem
        //create an returning array of size bixes.length
        
        int n=boxes.length();
        int ans[]=new int[n];
        
        for(int i=0;i<n;i++)
        {
            int x=0;
            for(int j=0;j<n;j++)
            {
                if(boxes.charAt(j)=='1')
                    x+=Math.abs(i-j);
            }
            ans[i]=x;
        }
        return ans;
    }
}