class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> ans=new ArrayList<>();
        
        //so i will mantain 1 HashSet that will store all the values like weather they won or loss. to track the palyers.
        //next i will maintain a hashmap which will contain key as players who lossed and value as times they lossed/=.
        
        ArrayList<Integer> zero=new ArrayList<>();
        ArrayList<Integer> one=new ArrayList<>();
        
        
        HashSet<Integer> hs=new HashSet<>();
        HashMap<Integer,Integer> hm=new HashMap<>();
        
        for(int i=0;i<matches.length;i++)
        {
            //main loop starts.
            int win=matches[i][0];
            int loss=matches[i][1];
            
            hs.add(win);hs.add(loss);
            if(hm.containsKey(loss))
                hm.put(loss,hm.get(loss)+1);
            else
                hm.put(loss,1);
        }
        
        //iterate over hashmap
        for (Map.Entry<Integer,Integer> mapElement : hm.entrySet()) {
            int key = (mapElement.getKey()); 
            int value = (mapElement.getValue() );
            hs.remove(key);
            if(value==1)
                one.add(key);
            
        }
        Set<Integer> treeSet = new TreeSet<Integer>(hs);
        for (int x: treeSet) {
            zero.add(x);}
        
        Collections.sort(one);
        
        ans.add(zero);
        ans.add(one);
        return ans;
    }
}