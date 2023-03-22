class Solution {
    
    int ans=Integer.MAX_VALUE;
    public int minScore(int n, int[][] roads) {
        Map<Integer,List<List<Integer>>> adj=new HashMap<>();
        
        for(int[] road:roads)
        {
            adj.computeIfAbsent(road[0],k -> new ArrayList<List<Integer>>()).add(Arrays.asList(road[1],road[2]));
            
            adj.computeIfAbsent(road[1],k -> new ArrayList<List<Integer>>()).add(Arrays.asList(road[0],road[2]));
        }
        
        boolean[] visit=new boolean[n+1];
        
        dfs(1,adj,visit);
        
        return ans;
    }
    
    private void dfs(int node, Map<Integer,List<List<Integer>>> adj,boolean[] visit)
    {
        visit[node]=true;
        
        if(!adj.containsKey(node)) return;
        
        for(List<Integer> edge: adj.get(node))
        {
            ans=Math.min(ans,edge.get(1));
            
            if(!visit[edge.get(0)])
                dfs(edge.get(0),adj,visit);
        }
    }
}