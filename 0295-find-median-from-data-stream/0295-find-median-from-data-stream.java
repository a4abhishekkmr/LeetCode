class MedianFinder {

    ArrayList<Integer> al;
    public MedianFinder() {
        al=new ArrayList<>();
    }
    
    public void addNum(int num) {
        int flag=0;
        for(int i=0;i<al.size();i++){
            if(al.get(i)>=num){
                al.add(i,num);
                flag=1;
                break;
            }
        }
        if(flag==0)
            al.add(num);
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