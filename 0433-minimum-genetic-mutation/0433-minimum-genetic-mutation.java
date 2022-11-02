class Solution {
    public int minMutation(String start, String end, String[] bank) {
        
        Queue<String> q=new LinkedList<>();
        HashSet<String> vis=new HashSet<>();
        
        int steps=0;
        q.add(start);
        vis.add(start);
        
        while(!q.isEmpty())
        {
            int size=q.size();
            for(int i=0;i<size;i++)
            {
                String node=q.remove();
                if(node.equals(end)) return steps;//ans
                for(char ch:new char[]{'A','C','G','T'})
                {
                    for(int j=0;j<node.length();j++)
                    {
                        String neighbour=node.substring(0,j)+ch+node.substring(j+1);
                        if(!vis.contains(neighbour)  && Arrays.asList(bank).contains(neighbour))
                        {
                            q.add(neighbour);
                            vis.add(neighbour);
                        }
                    }
                }
            }
            steps++;
        }
        return -1;
    }
}