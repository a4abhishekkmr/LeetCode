class Solution {


    public boolean possibleBipartition(int n, int[][] dislikes) {

        int color[]=new int[n+1];
        List<Integer>[] graph = new List[n + 1];
        for (int i = 1; i <= n; ++i) graph[i] = new ArrayList<>();

        //array hai pura as a dislike
        for (int[] dislike : dislikes) {
            graph[dislike[0]].add(dislike[1]);
            graph[dislike[1]].add(dislike[0]);
        }
        //1=blue, -1=red
        for(int i=1;i<=n;i++)
        {
            if(color[i]==0)
            {
                LinkedList<Integer> queue=new LinkedList<>();
                queue.add(i);
                color[i]=1;
                while(queue.size()!=0)
                {
                    int top=queue.removeFirst();
                    for(int neighbour:graph[top])
                    {
                        if(color[neighbour]==color[top]) return false;//check for current dislike element
                        if(color[neighbour]==0)
                        {//add new item
                            color[neighbour]=-color[top];
                            queue.add(neighbour);
                        }
                    }
                }
            }
        }
        return true;
    }
}