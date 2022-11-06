class MyCalendar {
    HashMap<Integer,Integer> hm;
    public MyCalendar() {
        hm=new HashMap();
    }
    
    public boolean book(int start, int end) {
        for(Integer key:hm.keySet())
        {
            if(key<end && hm.get(key)>start)
            {
                return false;
            }
        }
        hm.put(start,end);
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */