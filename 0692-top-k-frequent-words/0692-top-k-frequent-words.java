class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        
        //Use HashMap to Store the number of Times String present then sort it as max freq and if same then sort as lexico
        
        HashMap<String,Integer> hm=new HashMap<>();
        
        for(String s:words)
        {
            hm.put(s,hm.getOrDefault(s,0)+1);
        }
        
        //Space used now
        List<String> al=new ArrayList<>(hm.keySet());
        //nlog n time now consuming below
        Collections.sort(al,(w1,w2)-> (hm.get(w1)==hm.get(w2)?w1.compareTo(w2):hm.get(w2)-hm.get(w1)));
                         
        List<String> ans=new ArrayList<>(k);
        
                         
        for(int i=0;i<k;i++)
                         {
                             ans.add(al.get(i));
                         }
        return ans;        
    }
}


