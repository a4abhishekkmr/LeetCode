class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        //ok for this type of ques lets start with making a vis array
        //then we will use dfs and there we will be using stack to push the keys which were
        //new this time and then mark the top one vis
        //lately check all the nodes if not vis then return false;
        
        
//         boolean vis[]=new boolean[rooms.size()];
//         vis[0]=true;
        
//         //dfs
//         Stack<Integer> st=new Stack<>();
//         st.push(0);//first element
        
//         while(!st.isEmpty())
//         {
//             int curr=st.pop();
//             for(int x:rooms.get(curr))
//             {
//                 if(!vis[x])
//                 {
//                     vis[x]=true;
//                     st.push(x);
//                 }
//             }
//         }
        //all set
        
        Queue<List<Integer>> q = new LinkedList();
        q.offer(rooms.get(0));
        int len = rooms.size();
        boolean[] visited = new boolean[len];
        visited[0] = true;
        while(!q.isEmpty())
        {
            List<Integer> current = q.poll();
            for(int n: current)
            {
                if(!visited[n])
                {
                    visited[n] = true;
                    q.offer(rooms.get(n));
                }
            } 
        }
        //now check for all
        for(boolean c:visited)
            if(!c) return false;
        
        return true;
    }
}

//tc-O(N+E) where N is number of rooms and k represents keys in it
//sc- O(n) again space used by stack and vis boolean this time not N+e because the vis ate not to be stored in stack

/*lets have a dry run of the first example
rooms = [[1],[2],[3],[]] now
st=0, vis=true,false,false,false   then 
curr=0 and x=1;
then we have st=1.  st again not empty 
curr=1 and then x=2; also vis=true,true,false,false
then we have st=2. st again not empty 
curr=2 and then x=3; also vis=true,true,true,false
then we have st=3. st again not empty 
curr=3 and then x=; also vis=true,true,true,true
this time st empty so while loop terminated.

and now checking for vis from 0 to 3 all vis to return true;
*/




/*BFS solution
Queue<List<Integer>> q = new LinkedList();
        q.offer(rooms.get(0));
        int len = rooms.size();
        boolean[] visited = new boolean[len];
        visited[0] = true;
        while(!q.isEmpty())
        {
            List<Integer> current = q.poll();
            for(int n: current)
            {
                if(!visited[n])
                {
                    visited[n] = true;
                    q.offer(rooms.get(n));
                }
            } 
        }
        */