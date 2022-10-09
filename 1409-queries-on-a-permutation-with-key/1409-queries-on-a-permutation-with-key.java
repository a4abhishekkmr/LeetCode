class Solution {
    public int[] processQueries(int[] queries, int m) {
        
        //ok so for this i will use arrayList
        
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=1;i<=m;i++) al.add(i);
        //permutatio created
        
        int ans[]=new int[queries.length];
        
        for(int i=0;i<queries.length;i++)
        {
            int val=queries[i];
            
            int index=al.indexOf(val);
            al.remove(index);
            al.add(0,val);
            ans[i]=index;
        }
        
        return ans;
    }
}