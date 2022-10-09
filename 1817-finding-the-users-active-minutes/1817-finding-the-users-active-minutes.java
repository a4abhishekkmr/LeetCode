class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        int ans[]=new int[k];
        //ok i got the point we are given k minutes we have to find at a particular time <k
        //how many users are active and particular user at same time count only once
        
        //i will use hashmap where i will put id as key and times as hashset in value
        
        HashMap<Integer,HashSet<Integer>> hm=new HashMap<>();
        
        for(int i=0;i<logs.length;i++)
        {
            if(!hm.containsKey(logs[i][0]))
            {
                HashSet<Integer> hs=new HashSet<>();
                hs.add(logs[i][1]);
                hm.put(logs[i][0],hs);
            }
            else
            {
                hm.get(logs[i][0]).add(logs[i][1]);
            }
        }
        
        //HAshSets ka size bataega kitne wale time ko increment krna hai
        
        for(Map.Entry<Integer,HashSet<Integer>> e:hm.entrySet())
        {
            ans[e.getValue().size()-1]++;//-1 for 0 indexed
        }
        
        return ans;
        
    }
}