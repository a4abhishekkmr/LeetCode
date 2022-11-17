class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        //ok i got the point. i will make a tray of 10 size and then iterate it over the string by putting it onto hashMap
        
        List<String> ans=new ArrayList<>();
        if(s.length()<10) return ans;
        
        HashMap<String,Integer> hm=new HashMap<>();
        
        String tray=s.substring(0,10);
        
        hm.put(tray,1);
        
        
        for(int i=1,j=11;j<=s.length();i++,j++)
        {
            tray=s.substring(i,j);
            if(!hm.containsKey(tray))
                hm.put(tray,1);
            else
                hm.put(tray,hm.get(tray)+1);
        }
        System.out.print(hm);
        for(Map.Entry<String,Integer> e:hm.entrySet())
        {
            if(e.getValue()>1)
                ans.add(e.getKey());
        
        }
        return ans;
        
    }
    

}