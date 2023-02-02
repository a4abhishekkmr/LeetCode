class Solution {
    public int findJudge(int n, int[][] trust) {
        //ok so this is simple as indegree and outdegree problem where we just need to find
        //indegree and out and when outdegree==0 and indegree==n-1 means judge found else -1
        
        int outdegree[]=new int[n+1];//trust
        int indegree[]=new int[n+1];//trust krne wla
        
        for(int i=0;i<trust.length;i++)
        {
            outdegree[trust[i][0]]++;
            indegree[trust[i][1]]++;
        }
        
        for(int i=1;i<=n;i++)
            // town judge must have 0 degrees out, and n-1 degrees in
            if(outdegree[i]==0 && indegree[i]==n-1)
                return i;
        
        return -1;
    }
}