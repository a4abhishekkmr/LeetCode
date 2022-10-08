class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        
        List<List<Integer>> ans=new ArrayList<>();
        HashMap<Integer,List<Integer>> hm=new HashMap<>();
        
        for(int i=0;i<groupSizes.length;i++)
        {
            int groupsize=groupSizes[i];
            
            List<Integer> group=new ArrayList<>();
            
            if(hm.containsKey(groupsize))
                group=hm.get(groupsize);
            
            group.add(i);
            
            hm.put(groupsize,group);
            
            if(group.size()==groupsize)
            {ans.add(group);
             hm.remove(groupsize);}
        }
        
        return ans;
    }
}