class Solution {
    public int minStoneSum(int[] piles, int k) {
        //since we can do operations multiple times even to the piles[i]
        //so i am going with PriorityQueue and then
        //remove the largest one and with that
        //do my operation and put again till i<k;
        
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>(Collections.reverseOrder());
        
        for(int x:piles)
            pq.add(x);
        //all added
        
        //now remove
        int i=0;
        while(i<k)
        {
            int top=pq.poll();
            int half=(top+1)/2;
            pq.add(half);
            i++;
        }
        
        //now i need to sum all the elements in pq
        
        int sum=0;
        Iterator itr=pq.iterator();
        while(itr.hasNext())
        {
            sum+=(int)itr.next();//object to int
        }
        
        return sum;
    }
}