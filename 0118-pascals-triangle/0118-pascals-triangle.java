class Solution {
    public List<List<Integer>> generate(int n) {
        
        List<List<Integer>> ans=new ArrayList<>();
        
        for(int i=0;i<n;i++)//number of rows
        {
            ArrayList<Integer> al=new ArrayList<>();
            
            for(int j=0;j<=i;j++)
            {
                if(j==0 || j==i)
                    al.add(1);
                else 
                {
                    int left=ans.get(i-1).get(j-1);
                    int right=ans.get(i-1).get(j);
                    al.add(left+right); 
                }
            }
            
            ans.add((al));
        }
        return ans;
        
    }
}