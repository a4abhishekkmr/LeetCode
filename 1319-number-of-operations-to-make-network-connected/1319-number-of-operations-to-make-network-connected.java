class Solution {
    public int makeConnected(int n, int[][] arr) {//connections as arr
        int cables=arr.length;
        if(n>(cables+1)) return -1;
//         boolean visited[]=new boolean[n];
        
//         for(int i=0;i<connections.length;i++)
//         {
//             if(!visited[connections[i][0]]) visited[connections[i][0]]=true;
//             if(!visited[connections[i][1]]) visited[connections[i][1]]=true;
//         }
//         int count=0;
//         for(int i=0;i<n;i++)
//             if(!visited[i]) count++;
        
//         return count;
     //////////////////////////////////////////////////////////   
        /*This didnt worked because
        For example:

(1)-(2)  (4)-(5)
 |  /
(3)
All of the computers are connected to some other computers. But they don't form one connected network. You need to find the number of such DN (disconnected networks aka disjoint sets), in this case DN=2 (1,2,3 and 4,5).
And the answer is DN-1. */
        
        HashSet<Integer>[] edges = new HashSet[n];
        for(int i=0;i<n;i++) {
            edges[i] = new HashSet<>();
        }
        for(int i=0;i<arr.length;i++) {
            edges[arr[i][0]].add(arr[i][1]);
            edges[arr[i][1]].add(arr[i][0]);
        }
//yaha tak point 1 to 4
        boolean[] visited = new boolean[n];
        int ans  = -1;
         for(int i=0;i<n;i++) {
            if(!visited[i]) {
                ans++;
                dfs(edges,visited,i);
            }
        }   
// yaha ans me vo components honge based om image
    if (arr.length < n - 1) {
            return -1;
        }
        return ans;
    }
    
    private void dfs(HashSet<Integer>[] edges,boolean[] visited, int src) {
        visited[src] = true;
        HashSet<Integer> edge = edges[src];
        for(Integer i : edge) {
            if(!visited[i]) {
                dfs(edges,visited,i);
            }
        }
    }
}