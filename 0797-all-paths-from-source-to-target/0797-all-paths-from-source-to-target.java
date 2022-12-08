class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
//no need to build graph for connection list since graph as is
//dfs start from 0 node
//"backtrack" the path and add to res list
//time : e + v
        
        List<List<Integer>> res=new ArrayList<>();
        
        List<Integer> currentPath=new ArrayList<>();
        
        currentPath.add(0);
        //store the first position
        int len=graph.length;
        
        dfs(0,len-1,graph,currentPath,res);
        //this will fill the res with req res.
        return res;
    }
    
    private void dfs(int currentPosition,int destination,int[][] graph,List<Integer> currentPath,List<List<Integer>> res)
    {
        if(currentPosition==destination)//pahuch gye
        {
            ArrayList<Integer> finalPath=new ArrayList<>();
            finalPath.addAll(currentPath);
            res.add(finalPath);
        }
        else
        {
            int[] vertices=graph[currentPosition];
            for(int child:vertices)
            {
                currentPath.add(child);
                dfs(child,destination,graph,currentPath,res);
                currentPath.remove(currentPath.size()-1);
            }
        }
    }
}