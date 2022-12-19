class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        //this question can be solved by the multiple ways of iteration of graphs
        //Either using BFS or DFS
        //but one more solution can give us results is Disjoint Set Union 
        //where we check if both nodes belong to the same group (thus are connected via some path) or not.
        
        //i am going to use BFS here
        //algo
        //1. take a queue and put the first one(source) and aslo take a boolean array of visited nodes and mark source as visted.
        //2.add a hashmap to store all connected eges of it
        //3. put all edges of current popped element from queue and also check for the dest.
        //4.if not dest. put all unvisited nodes to the queue and repeat again
        //5.if queue emmpty and not found return false;
        if(edges.length==0) return true;
        
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int i=0; i<n; i++) {
            graph.put(i, new ArrayList<Integer>());
        }
        for (int i=0; i<edges.length; i++) {
            int v1 = edges[i][0];
            int v2 = edges[i][1];
            graph.get(v1).add(v2);
            graph.get(v2).add(v1);
        }//from both the sides
        
        boolean vis[]=new boolean[n];
        vis[source]=true;
        
        Queue<Integer> q=new LinkedList<>();
        q.offer(source);
        
        while(!q.isEmpty())
        {
            int curr=q.poll();
            if(curr==destination) return true;
            
            //we need to add all the neighbours of the curr
            
            for(int nextNode: graph.get(curr))
            {
                if(!vis[nextNode])
                {
                    vis[nextNode]=true;
                    q.offer(nextNode);
                }
            }
            
        }
        
        return false;
    }
}

//tc-O(n+m) and space -O(m+n) where n be the number of nodes and m be the number of edges.

/* DFS
class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        
        if(edges.length==0) return true;
        
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int i=0; i<n; i++) {
            graph.put(i, new ArrayList<Integer>());
        }
        for (int i=0; i<edges.length; i++) {
            int v1 = edges[i][0];
            int v2 = edges[i][1];
            graph.get(v1).add(v2);
            graph.get(v2).add(v1);
        }//from both the sides
        
        boolean vis[]=new boolean[n];
        return dfs(graph,seen,source,destination);
    }
    
    private boolean dfs(Map<Integer, List<Integer>> graph, boolean[] seen, int currNode, int destination) {
        if (currNode == destination) {
            return true;
        }
        if (!seen[currNode]) {
            seen[currNode] = true;
            for (int nextNode : graph.get(currNode)) {
                if (dfs(graph, seen, nextNode, destination)) {
                    return true;
                }
            }
        }
        return false;
    }
}
*/ //fully recursive
//again tc-O(n+m) and sc-O(n+m) where n be the number of nodes and m be the number of edges.