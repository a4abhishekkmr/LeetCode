class RandomizedSet {

    HashSet<Integer> hs;
    
    public RandomizedSet() {
        hs=new HashSet<>();
    }
    
    public boolean insert(int val) {
        if(!hs.contains(val))
        {
            hs.add(val);
            return true;
        }
        return false;
    }
    
    public boolean remove(int val) {
        if(hs.contains(val))
        {
            hs.remove(val);
            return true;
        }
        return false;
    }
    int t=0;
    public int getRandom() {
        
        //int n=hs.size();
       List<Integer> list = new ArrayList<Integer>(hs);
       int r=(int)(Math.random()*hs.size());
        
       return list.get(r);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */