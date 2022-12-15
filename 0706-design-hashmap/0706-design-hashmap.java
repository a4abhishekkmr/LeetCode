class MyHashMap {

    //HashMap<Integer,Integer> hm;
    
    int hash[];
    public MyHashMap() {
        //hm=new HashMap<>();
        
        hash=new int[1000001];
        Arrays.fill(hash,-1);//as 0 is also a key
    }
    
    public void put(int key, int value) {
        
            //hm.put(key,value);
        ///waht rubbish
//this is giving me the value also tha t how much its passing
        //System.out.println(key+" "+value);
        
        hash[key]=value;
    }
    
    public int get(int key) {
        //if(hm.containsKey(key))
        //return hm.get(key);
            //return -1;
        
        return hash[key];
    }
    
    public void remove(int key) {
            //hm.remove(key);
        
        hash[key]=-1; //reset
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */