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
        
        
        /*Intuition
we will use dfs to solve this, padhte rho lg jaayega pta

Approach
first traverse over the array. and create a hashset array where each index ke paas padha h ki usse kitne or computer connected hai
for example at index 0 we will have ki 0 se kon kon connected hai
ab hum dfs lgaa rhe, maanlo shuru kr rhe 0 se , 0 will visit 1 and 2
3 reh jaayega, uske liye ans++ hoga,
basic logic ye h ki agar, hum vo vo nikaal le ki jitne computer h jo connected nhi h, mtlb see example below
. ab loop return kredegi kitne components h jo alag alag hai, agar aise 4 h to hume 3 wires chaye, so ans -1, or start ans from -1*/
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