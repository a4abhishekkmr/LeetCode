class Solution {
    public int[][] kClosest(int[][] points, int k) {
        //find the distance and choose the min k
        
        //given 1 <= k <= points.length <= 104
        
        int n=points.length;
        
        HashMap<Double,List<Integer>> map=new HashMap<>();
        PriorityQueue<Double> pq=new PriorityQueue<>(Collections.reverseOrder());
        
        
        for(int i=0;i<n;i++)
        {
            int []point=points[i];
            int a=point[0];
            int b=point[1];
            double square=Math.sqrt(a*a+b*b);

        List<Integer> al=map.getOrDefault(square,new ArrayList<>());
            al.add(i);
            map.put(square,al);
            
            if(pq.size()<k){pq.add(square);}
            else
            {
                if(pq.peek()>square)
                {
                    pq.poll();
                    pq.offer(square);
                }
            }
        }
        int [][]ans=new int[k][2];
        
        int i=0;
        
        //put time
        while(pq.size()>0)
        {
            double val=pq.poll();
            if(map.containsKey(val))
            {
                List<Integer> al=map.get(val);
                for(int x:al)
                {int[] point=points[x];
                ans[i++]=point;}
            }
            map.remove(val);
        }
        return ans;
        
    }
}

