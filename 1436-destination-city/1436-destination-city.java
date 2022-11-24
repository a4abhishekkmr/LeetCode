class Solution {
    public String destCity(List<List<String>> paths) {
        HashSet<String> hs=new HashSet<>();
        
        for(int i=0;i<paths.size();i++)
            hs.add(paths.get(i).get(1));
        
        for(int i=0;i<paths.size();i++)
            hs.remove(paths.get(i).get(0));
        
        return hs.iterator().next();
    }
}