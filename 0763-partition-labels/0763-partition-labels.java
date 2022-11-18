class Solution {
    public List<Integer> partitionLabels(String s) {
        
        ArrayList<Integer> ans=new ArrayList<>();
        HashMap<Character,Integer> hm=new HashMap<>();
        
        for(int i=0;i<s.length();i++)
        {
            hm.put(s.charAt(i),i);
        }
        
        int prev=-1;
        int max=0;
        
            //formula = max-prev
            
            for(int i=0;i<s.length();i++)
            {
                    max=Math.max(max,hm.get(s.charAt(i)));
                    
                    //
                    if(i==max)
                            //partition time
                    {
                            ans.add(max-prev);
                            prev=max;//aage badha die
                    }
                    
            }
            return ans;
    }
}