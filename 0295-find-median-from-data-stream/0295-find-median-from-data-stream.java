class MedianFinder {

    ArrayList<Integer> al;
    public MedianFinder() {
        al=new ArrayList<>();
    }
    
    public void addNum(int num) {
        int i;
        if(al.size() > 0){
            for (i = 0; (i < al.size()  && al.get(i) < num); i++);
            if(i == -1){
                i = 0;
            }
            al.add(i , num);
        }else{
            al.add(num);
        }
    }
    
    public double findMedian() {
        
        int n=al.size();
        if(n%2==1) return (double)al.get(n/2);
        else
        {
            int mid=n/2;
            double sum=al.get(mid-1)+al.get(mid);
            return sum/2;
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */