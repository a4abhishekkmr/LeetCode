class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i:stones)pq.offer(i);
        
        while(pq.size()>1)
        {
            int stone1=pq.poll();
            int stone2=pq.poll();
            
            if(stone1!=stone2)//stone1 bhari hai(heavier)
                pq.offer(stone1-stone2);
        }
        //since atmost 1 will be avaialble so the chances are pq can be empty
        //for ex- arr=2,2
        return pq.size()==0?0:pq.poll();
    }
}